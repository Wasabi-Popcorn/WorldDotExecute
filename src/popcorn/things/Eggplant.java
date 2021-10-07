package popcorn.things;

import popcorn.Lovable;
import popcorn.Thing;
import popcorn.World;

public interface Eggplant  {

    default Thing getNutrients(){
        System.out.println("If I'm an eggplant");
        System.out.println("Then I will give you my");
        System.out.println("NUTRIENTS");
        return new Lovable();
    }
    default void resetNutrients(){}
}
