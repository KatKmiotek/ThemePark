import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.*;

public class ThemeParkTest {
    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    Visitor visitor;


    @Before
    public void before(){
        themePark = new ThemePark(dodgems, park, playground, rollerCoaster, candyflossStall, iceCreamStall, tobaccoStall);
        dodgems = new Dodgems("New", 7);
        park = new Park("Old", 5);
        playground = new Playground("Big", 8);
        rollerCoaster = new RollerCoaster("small", 10);
        candyflossStall = new CandyflossStall("Sweet", "Bob", ParkingSpot.A1, 8);
        iceCreamStall = new IceCreamStall("Cold", "Max", ParkingSpot.A4, 8);
        tobaccoStall = new TobaccoStall("Foggy", "Paul", ParkingSpot.B1, 10);
        visitor = new Visitor(20, 170, 20);
    }

//    @Test
//    public void getAllReviewed() {
//        assertEquals(7, themePark.getAllReviewed().size());
//    }

    @Test
    public void visit() {
    }
}