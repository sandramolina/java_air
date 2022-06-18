package staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {
    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Carlos Jimenez", RankTypes.CAPTAIN, "EH104567");
    }

    @Test
    public void hasName(){assertEquals("Carlos Jimenez", pilot.getName());}

    @Test
    public void hasRank(){assertEquals(RankTypes.CAPTAIN, pilot.getRank());}

    @Test
    public void hasLicense(){assertEquals("EH104567", pilot.getLicense());}

    @Test
    public void canPilotPlane(){assertEquals("Time to leave", pilot.PilotPlane());}
}