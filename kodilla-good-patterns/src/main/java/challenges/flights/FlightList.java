package challenges.flights;

import java.util.*;

public class FlightList {
    private final List<Flight> flightList = new ArrayList<>();

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(Flight flight) {
        this.flightList.add(flight);
    }
}