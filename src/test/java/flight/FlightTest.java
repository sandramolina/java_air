package flight;

import org.junit.Before;
import org.junit.Test;
import staff.CabinCrewMember;
import staff.Pilot;
import staff.RankTypes;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Passenger passenger;
    private Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("John Travolta", RankTypes.FIRST_OFFICER, "RGH5467");
        cabinCrewMember1 = new CabinCrewMember("Lindsey Lohan", RankTypes.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Mario Baracus", RankTypes.PURSER);
        crewMembers = new ArrayList<>();
        crewMembers.add(cabinCrewMember1);
        crewMembers.add(cabinCrewMember2);
        passengers = new ArrayList<>();
        plane = new Plane(PlaneTypes.BOE747);
        flight= new Flight(
                pilot,
                crewMembers,
                passengers,
                plane,
                "JA2431",
                "EZE",
                "EDI",
                "19:45" );
    }

    @Test
    public void getPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void getCrewMembers() {
        assertEquals(2, flight.getCrewMembers().size());
    }

    @Test
    public void getPassengers() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void getPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void getFlightNumber() {
        assertEquals("JA2431", flight.getFlightNumber());
    }

    @Test
    public void getDestination() { assertEquals("EZE", flight.getDestination());
    }

    @Test
    public void getDeparture() { assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void getDepartureTime() { assertEquals("19:45", flight.getDepartureTime());
    }

    @Test
    public void getSeatsLeft(){assertEquals(524, flight.seatsLeft());}

    @Test
    public void canBookPassenger(){
        passenger = new Passenger("Pepa Pig", 2);
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canNotBookIfCompleted(){
        passenger = new Passenger("Pepa Pig", 2);
        while(flight.seatsLeft() > 0) {
            flight.bookPassenger(passenger);
        }
        flight.bookPassenger(passenger);
        assertEquals(0, flight.seatsLeft());

    }
}