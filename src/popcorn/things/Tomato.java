package popcorn.things;

import popcorn.Lovable;
import popcorn.Thing;
import popcorn.World;

public interface Tomato {

    default Thing getAntioxidants() {
        System.out.println("If I'm a tomato");
        System.out.println("Then I will give you");
        System.out.println("ANTIOXIDANTS");
        return new Lovable();
    }

    default void resetAntioxidants(){}
}
