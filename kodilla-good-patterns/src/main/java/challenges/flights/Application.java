package challenges.flights;

public class Application {
    public static void main(String[] args) {

        FlightFinder flightFinder=new FlightFinder();
        flightFinder.findAllFlightsFromPrint("Katowice");
        flightFinder.findAllFlightsToPrint("Modlin");
        flightFinder.findFlightWithChange("Lodz", "Krakow");
    }
}