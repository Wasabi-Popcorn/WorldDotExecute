package popcorn.things;

import popcorn.Lovable;
import popcorn.Thing;
import popcorn.World;

public interface PointSet {

    default Thing getDimensions() {
        System.out.println("If I'm a set of points");
        System.out.println("Then I will give you my");
        System.out.println("DIMENSION");
        return new Lovable();
    }

    default void resetDimensions() {
    }
}
