package popcorn.things;

import popcorn.Lovable;
import popcorn.Thing;
import popcorn.World;

public interface Circle {

    default Thing getCircumference(){
        System.out.println("If I'm a circle");
        System.out.println("Then I will give you my");
        System.out.println("CIRCUMFERENCE");
        return new Lovable();
    }

    default void resetCircumference(){}
}
