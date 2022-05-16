package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.List;

public class PossibleFlights {

    public static void main(String[] args) {

        Flight n1 = new Flight("Krakow", "Dubaj");
        Flight n2 = new Flight("Krakow", "Wlochy");
        Flight n3 = new Flight("Warszawa", "USA");
        Flight n4 = new Flight("Warszawa", "Portugalia");
        Flight n5 = new Flight("Wroclaw", "Grecja");

        List<Flight> flights = new ArrayList<>();
        flights.add(n1);
        flights.add(n2);
        flights.add(n3);
        flights.add(n4);
        flights.add(n5);

        FlightSearchLogic flightSearch = new FlightSearchLogic(flights);
        try {
            flightSearch.flightFind(new Flight("Warszwa", "Dubaj"));
        }catch (RouteNotFoundException e) {
            System.out.println(e);


        }
    }
}
