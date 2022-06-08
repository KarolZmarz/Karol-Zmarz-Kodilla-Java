package challenges.flightsCompany;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlightsSearch {

    public List<Flight> searchByArrival(String arrival) {
        return FlightsList.getListOfFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<Flight> searchByDeparture(String departure) {
        return FlightsList.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flight> searchDirectFlight(String departure, String arrival) {
        return FlightsList.getListOfFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<ConnectingFlights> searchFlightWithConnecting(String departure, String arrival) {
        List<Flight> departureAirports = searchByDeparture(departure);
        List<Flight> arrivalAirports = searchByArrival(arrival);

        return departureAirports.stream()
                .flatMap(f -> arrivalAirports.stream().filter(g -> g.getDeparture().equals(f.getArrival())).map(g -> new ConnectingFlights(f, g)))
                .collect(Collectors.toList());
    }
}


