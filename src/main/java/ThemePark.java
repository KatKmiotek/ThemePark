import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    private ArrayList<IReviewed> reviewedAttractions;

    public ThemePark(Dodgems dodgems, Park park, Playground playground, RollerCoaster rollerCoaster, CandyflossStall candyflossStall, IceCreamStall iceCreamStall, TobaccoStall tobaccoStall){
        this.dodgems = dodgems;
        this.park = park;
        this.playground = playground;
        this.rollerCoaster = rollerCoaster;
        this.candyflossStall = candyflossStall;
        this.iceCreamStall = iceCreamStall;
        this.tobaccoStall = tobaccoStall;
        this.reviewedAttractions = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getReviewedAttractions() {
        return reviewedAttractions;
    }

    public void setReviewedAttractions(ArrayList<IReviewed> reviewedAttractions) {
        this.reviewedAttractions = reviewedAttractions;
    }
//    public void getAllReviewed(){
//        for(IReviewed attraction : ){
//            reviewedAttractions.add(attraction);
//        }
//    }

    public void visit(Visitor visitor, Attraction visitedAttraction){
        visitedAttraction.addVisit();
        visitor.addAttraction(visitedAttraction);
    }
}
