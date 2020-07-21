import attractions.*;
import behaviours.IReviewed;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewedAttractions;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.reviewedAttractions = new ArrayList<IReviewed>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getReviewedAttractions() {
        return reviewedAttractions;
    }

    public void setReviewedAttractions(ArrayList<IReviewed> reviewedAttractions) {
        this.reviewedAttractions = reviewedAttractions;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        for(Attraction attraction : attractions){
            reviewedAttractions.add(attraction);
        }
        for(Stall stall : stalls){
            reviewedAttractions.add(stall);
        }
        return reviewedAttractions;
    }
//    public void visit(Visitor visitor){
//        Attraction attraction = attractions.get(0);
//        attraction.getVisitCount()++;
//    }
}
