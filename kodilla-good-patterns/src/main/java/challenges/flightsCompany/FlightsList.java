package challenges.flightsCompany;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {

    public static List<Flight> getListOfFlights() {
        List<Flight> flightList = new ArrayList<Flight>();
        flightList.add(new Flight("Rzeszow", "Warszawa", 124325));
        flightList.add(new Flight("Wroclaw", "Warszawa", 165322));
        flightList.add(new Flight("Poznan", "Warszawa", 875525));
        flightList.add(new Flight("Gdansk", "Warszawa", 851225));
        flightList.add(new Flight("Rzeszow", "Krakow", 214325));
        flightList.add(new Flight("Warszawa", "Lublin", 953225));

        return new ArrayList<Flight>(flightList);
    }
}
