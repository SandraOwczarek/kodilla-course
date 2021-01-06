package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Stavanger", true);
        flights.put("Reyjkavik", false);
        flights.put("Oslo", true);
        flights.put("Trondheim", false);
        flights.put("Cracow", true);

        if (!flights.containsKey(flight.getDepartureAirport())) {
            System.out.println("Flight to " + flight.departureAirport + " isn't in our offer");
            throw new RouteNotFoundException("Flight doesn't exist!");
        } else if (flights.get(flight.getDepartureAirport())) {
            System.out.println("Flight to " + flight.departureAirport + " is available");
        }else {
            System.out.println("We are sorry , flight to " + flight.departureAirport + " is not available, all tickets are sold out.");
        }

    }
}