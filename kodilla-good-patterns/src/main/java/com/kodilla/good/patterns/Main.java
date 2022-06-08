package com.kodilla.good.patterns;

import challenges.flightsCompany.ConnectingFlights;
import challenges.flightsCompany.Flight;
import challenges.flightsCompany.FlightsSearch;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlightsSearch flightSearcher = new FlightsSearch();

        List<Flight> departureFlights = flightSearcher.searchByDeparture("Katowice");
        departureFlights.forEach(System.out::println);

        List<Flight> arrivalFlights = flightSearcher.searchByArrival("Gdansk");
        arrivalFlights.forEach(System.out::println);

        List<Flight> directFlights = flightSearcher.searchDirectFlight("Warszawa", "Gdansk");
        directFlights.forEach(System.out::println);

        List<ConnectingFlights> interchangeFlights =  flightSearcher.searchFlightWithConnecting("Katowice", "Gdansk");
        interchangeFlights.forEach(p -> System.out.println(p.getFirst() + " *** " + p.getSecond()));
    }
}
