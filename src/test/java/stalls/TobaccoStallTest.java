package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor5;
    Visitor visitor6;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 7);
        visitor5 = new Visitor(20, 200, 10);
        visitor6 = new Visitor(15, 200, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }
    @Test
    public void isAllowed(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor5));
    }
    @Test
    public void isNotAllowed(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor6));
    }
}
