package challenges.flightsCompany;

import java.util.Objects;

public class Flight {

    private final String departure;
    private final String arrival;
    private final int flightNumber;

    public Flight(String departure, String arrival, int flightNumber) {
        this.departure = departure;
        this.arrival = arrival;
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightNumber() == flight.getFlightNumber() && Objects.equals(getDeparture(), flight.getDeparture()) && Objects.equals(getArrival(), flight.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeparture(), getArrival(), getFlightNumber());
    }
}
