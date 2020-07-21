package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {
    private double defaultPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 8.40;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
        return 2 * defaultPrice;
    }else{
         return defaultPrice;
        }
    }


    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 && visitor.getHeight()> 145){
            return true;
        }
        return false;
    }

}
