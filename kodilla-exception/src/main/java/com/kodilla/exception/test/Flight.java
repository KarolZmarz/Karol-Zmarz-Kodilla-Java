package com.kodilla.exception.test;

public class Flight {

    private String departureAirport;
    private String ArrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        ArrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return ArrivalAirport;
    }
}
