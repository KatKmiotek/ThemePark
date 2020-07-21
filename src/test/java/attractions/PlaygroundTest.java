package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor3 = new Visitor(7, 120, 10);
        visitor4 = new Visitor(18, 120, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }
    @Test
    public void isAllowed(){
        assertEquals(true, playground.isAllowedTo(visitor3));
    }
    @Test
    public void isNotAllowed(){
        assertEquals(false, playground.isAllowedTo(visitor4));
    }
}
