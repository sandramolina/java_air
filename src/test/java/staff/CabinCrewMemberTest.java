package staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {
    private CabinCrewMember crewMember;

    @Before
    public void before(){
        crewMember = new CabinCrewMember("Paolo Piccolo", RankTypes.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){assertEquals("Paolo Piccolo", crewMember.getName());}

    @Test
    public void hasRank(){assertEquals(RankTypes.FLIGHT_ATTENDANT, crewMember.getRank());}

    @Test
    public void canTalkToPassengers(){assertEquals("Please fasten your belts", crewMember.talk());}
}