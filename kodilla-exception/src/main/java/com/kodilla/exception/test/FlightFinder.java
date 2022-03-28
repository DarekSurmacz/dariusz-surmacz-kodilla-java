package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> airports = new HashMap<>();

    public FlightFinder() {
        airports.put("Balice", true);
        airports.put("Pyrzowice", true);
        airports.put("Bielsko-Biała", false);
        airports.put("Okęcie", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (airports.get(flight.getArrivalAirport()) != null) {

            if (airports.get(flight.getArrivalAirport())) {
                System.out.println("Flight has been found.");

            } else {
                throw new RouteNotFoundException("This airport is not available.");
            }

        } else {
            throw new RouteNotFoundException("There is no such arrival airport.");
        }
    }
}