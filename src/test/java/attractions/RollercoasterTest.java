package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor7;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 160, 20);
        visitor7 = new Visitor(13, 160, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }
    @Test
    public void wontChargeDouble(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.01);
    }
    @Test
    public void isAllowed(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor7));
    }
    @Test
    public void isNotAllowed(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }
}
