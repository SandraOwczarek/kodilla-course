package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {

        FlightFinder find = new FlightFinder();

        try {
            find.findFlight(new Flight("Stavanger", "Warsaw"));
            find.findFlight(new Flight("Trondheim", "Warsaw"));
            find.findFlight(new Flight("Oslo", "Warsaw"));
            find.findFlight(new Flight("Bergen", "Warsaw"));
        } catch (RouteNotFoundException e) {
            System.out.println("Please, write down european airport :");
        }

    }
}