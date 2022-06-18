package flight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {

    private Passenger passenger;
    @Before
    public void before(){passenger=new Passenger("Sandra Molina", 3);}

    @Test
    public void hasName(){assertEquals("Sandra Molina", passenger.getName());}

    @Test
    public void hasNumOfBags(){assertEquals(3, passenger.getNumOfBags());}

}