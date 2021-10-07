package popcorn.things;

import popcorn.Lovable;
import popcorn.Thing;
import popcorn.World;

public interface Sequence {
    default Thing setLimit(Thing thing) {
        System.out.println("If I approach infinity");
        System.out.println("then you can be my");
        System.out.println("LIMITATIONS\n");
        return new Lovable();
    }

    default Thing toLimit(){
        return new Lovable();
    }
}
