package flight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {
    private Plane plane;

    @Before
    public void before(){plane=new Plane(PlaneTypes.ABA350);}

    @Test
    public void hasPlaneName(){assertEquals(PlaneTypes.ABA350.getPlaneName(), plane.getPlaneName());}

    @Test
    public void hasCapacity(){assertEquals(PlaneTypes.ABA350.getCapacity(), plane.getCapacity());}

    @Test
    public void hasWeight(){assertEquals(PlaneTypes.ABA350.getWeight(), plane.getWeight(), 0.0);}

}