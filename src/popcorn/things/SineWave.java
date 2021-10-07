package popcorn.things;

import popcorn.Lovable;
import popcorn.Thing;

public interface SineWave {

    default Thing getTangent(Thing thing) {
        System.out.println("If I'm a sine wave");
        System.out.println("Then you can sit on all my");
        System.out.println("TANGENTS");
        return new Lovable();
    }

    default void addAction(String action, Thing thing){}

    default Thing getXPosition(){
        return new Lovable();
    }
}
