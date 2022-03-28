package com.kodilla.exception.test;

public class Flights {
    public static void main(String[] args) throws RouteNotFoundException {
        FlightFinder flights = new FlightFinder();
        Flight Flight1 = new Flight("Balice", "Bielsko-Biała");
        Flight Flight2 = new Flight("Balice", "adsgfasd");
        Flight Flight3 = new Flight("Balice", "Pyrzowice");
        Flight Flight4 = new Flight("Pyrzowice", "Okęcie");
        try {
            flights.findFlight(Flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            flights.findFlight(Flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            flights.findFlight(Flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        try {
            flights.findFlight(Flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}