package challenges.flights;


public class Application {
    public static void main(String[] args) {
        FlightScanner flightScanner = new FlightScanner();
        flightScanner.printDepartureAirport("WMI");
        flightScanner.printArrivalAirport("WRO");
        flightScanner.printConnectingAirport("WAW", "WRO");
    }
}