package challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    public List<String> findAllFlightsFrom(String cityFrom) {
        return FlightsDatabase.accessToSet().stream()
                .filter(flight -> flight.getFlightFrom().equals(cityFrom))
                .map(Flight::getFlightTo)
                .collect(Collectors.toList());
    }

    public void findAllFlightsFromPrint(String cityFrom) {
        System.out.println("From " + cityFrom + " you can fly to: " + findAllFlightsFrom(cityFrom));
    }

    public List<String> findAllFlightsTo(String cityTo) {
        return FlightsDatabase.accessToSet().stream()
                .filter(flight -> flight.getFlightTo().equals(cityTo))
                .map(Flight::getFlightFrom)
                .collect(Collectors.toList());
    }

    public void findAllFlightsToPrint(String cityTo) {
        System.out.println("To " + cityTo + " you can fly from: " + findAllFlightsTo(cityTo));
    }

    public void findFlightWithChange(String cityFrom, String cityTo) {
        List<String> flightsFromCity = findAllFlightsFrom(cityFrom);
        List<String> flightsToCity = findAllFlightsTo(cityTo);

        List<String> list = new ArrayList<>();
        for (String flight : flightsFromCity) {
            if (flightsToCity.contains(flight)) {
                list.add(flight);
            }
        }
        System.out.println("To " + cityTo + " from " + cityFrom + " you can fly by: " + list);
    }
}
