package challenges.flightsCompany;

public class ConnectingFlights {

    private Flight first;
    private Flight second;

    public ConnectingFlights(Flight first, Flight second) {
        this.first = first;
        this.second = second;
    }

    public Flight getFirst() {
        return first;
    }

    public Flight getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "ConnectingFlights{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
