package popcorn.things;

import popcorn.Thing;
import popcorn.World;

public interface TabbyCat {
    default void purr(){
        System.out.println("If I'm a tabby cat");
        System.out.println("Then I will purr for your");
        System.out.println("ENJOYMENT");
    }
}
