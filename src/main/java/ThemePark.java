import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

public class ThemePark {
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;


    private ArrayList<IReviewed> reviewedAttractions;
    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster, CandyflossStall candyflossStall, IceCreamStall iceCreamStall, ParkingSpot parkingSpot, TobaccoStall tobaccoStall){
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.rollerCoaster = rollerCoaster;
        this.candyflossStall = candyflossStall;
        this.iceCreamStall = iceCreamStall;
        this.parkingSpot = parkingSpot;
        this.tobaccoStall = tobaccoStall;
        this.reviewedAttractions = new ArrayList<IReviewed>();


    }

    public Dodgems getDodgems() {
        return dodgems;
    }

    public Park getPark() {
        return park;
    }

    public Playground getPlayground() {
        return playground;
    }

    public RollerCoaster getRollerCoaster() {
        return rollerCoaster;
    }

    public CandyflossStall getCandyflossStall() {
        return candyflossStall;
    }

    public IceCreamStall getIceCreamStall() {
        return iceCreamStall;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public TobaccoStall getTobaccoStall() {
        return tobaccoStall;
    }

    public ArrayList<IReviewed> getReviewedAttractions() {
        return reviewedAttractions;
    }

    public void setReviewedAttractions(ArrayList<IReviewed> reviewedAttractions) {
        this.reviewedAttractions = reviewedAttractions;
    }
}
