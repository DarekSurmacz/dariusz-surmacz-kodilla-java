package challenges.flights;

public class Flight {
    private final String flightFrom;
    private final String flightTo;

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        if (!getFlightFrom().equals(flight.getFlightFrom())) return false;
        return getFlightTo().equals(flight.getFlightTo());
    }

    @Override
    public int hashCode() {
        int result = getFlightFrom().hashCode();
        result = 31 * result + getFlightTo().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                '}';
    }
}