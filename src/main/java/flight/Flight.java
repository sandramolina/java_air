package flight;
import java.util.ArrayList;

import staff.CabinCrewMember;
import staff.Pilot;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destination, String departure, String departureTime) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return this.crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int seatsLeft() {
        return this.plane.getCapacity() - getPassengers().size();
    }

    public void bookPassenger(Passenger passenger) {
        if(seatsLeft() > 0) {
            this.passengers.add(passenger);
        }
    }
}
