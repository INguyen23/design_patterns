package design_patterns.iterator;

import java.util.Iterator;

/**
 * Contains a list of Airlines and their respective flights
 * @author Ivon Nguyen
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) { 
        this.title = title;
        flights = new Flight[2];
        size = 0;
    }
    /**
     * Adds a new flight to the Array
     * @param flightNum
     * @param from
     * @param to
     * @param duration
     * @param transfers
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) { 
        if(size == flights.length) { 
            flights = growArray(flights);
        }

        flights[size] = new Flight(flightNum, from, to, duration, transfers);
        size++;
    }

    public String getTitle() { 
        return title;
    }
    /**
     * Doubles the size of the current array
     * @param flights
     * @return the new array 
     */
    public Flight[] growArray(Flight[] flights) { 
        Flight[] temp = new Flight[2*flights.length];
        for(int i = 0; i < flights.length; i++)
            temp[i] = flights[i];
        return temp;
    }

    public FlightIterator createIterator(){ 
        return new FlightIterator(flights);
    }
}
