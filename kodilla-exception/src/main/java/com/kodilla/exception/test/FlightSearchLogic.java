package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearchLogic {

    private List<Flight> listOfFlight = new ArrayList<>();
    public FlightSearchLogic(List<Flight> ListOfFlight) {
        this.listOfFlight = listOfFlight;
    }
    public void flightFind(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfFlight = new HashMap<>();
        listOfFlight.stream()
                .map(Flight::getArrivalAirport)
                .forEach(n -> mapOfFlight.put(n, true));

        if(!mapOfFlight.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Nie znaleziono takiego lotu do: " + flight.getArrivalAirport());
        }

        List<String> airports = listOfFlight.stream()
                .filter(n -> n.getArrivalAirport().equals(flight.getArrivalAirport()))
                .map(Flight::getDepartureAirport)
                .collect(Collectors.toList());

        System.out.println("Możesz polecieć do: " + flight.getArrivalAirport() + " z " + airports);
    }

}
