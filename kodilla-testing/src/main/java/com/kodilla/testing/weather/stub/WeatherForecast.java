package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private final Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double averageTemperature() {
        Double averageTemperature = Double.valueOf(0);

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            averageTemperature += temperature.getValue();
        }
        averageTemperature = averageTemperature / temperatures.getTemperatures().size();

        return averageTemperature;
    }

    //    Jeżeli w zestawie znajduje się nieparzysta liczba wyników, to medianą jest wyraz
    //    znajdujący się na środku uporządkowanego rosnąco zestawu.
    //    Jeżeli w zestawie jest parzysta liczba danych, to mediana jest równa średniej
    //    arytmetycznej dwóch środkowych wyrazów uporządkowanego rosnąco zestawu.
    public Double medianTemperature() {

        List<Double> temperaturesList = new ArrayList<>();
        Double median = 0.0;
        Double middleValuesSum = 0.0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
        }

        Collections.sort(temperaturesList);

        int listSize = temperaturesList.size();

        if (temperaturesList.size() % 2 == 0) {
            middleValuesSum = temperaturesList.get(listSize / 2)
                    + temperaturesList.get(listSize / 2 - 1);
            median = middleValuesSum / 2;
        } else {
            median = temperaturesList.get(listSize / 2);
        }

        return median;
    }
}