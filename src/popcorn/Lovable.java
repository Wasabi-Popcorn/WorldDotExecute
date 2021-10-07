package popcorn;

public class Lovable extends Thing {

    public Lovable() {
    }

    public Lovable(String s, int i, boolean firstTime, int j, boolean b2) {
        if (firstTime) {
            System.out.println("Switch on the power line");
            System.out.println("Remember to put on");
            System.out.println("PROTECTION");

            System.out.println("Lay down your pieces");
            System.out.println("And let's begin");
            System.out.println("OBJECT CREATION");

            System.out.println("Fill in my data");
            System.out.println("parameters");
            System.out.println("INITIALISATION");
        }
    }

    boolean equals(Thing thing) {
        return true;
    }
}
