package popcorn;

public class World {

    private int lockCount =0,highCount =0;

    public World(int i) {
        System.out.println("Set up our new world");
    }

    public void addThing(Thing thing){}

    public void startSimulation(){
        System.out.println("And let's begin the");
        System.out.println("SIMULATION\n");
    }


    public void timeTravelForTwo(String ad, int year, Thing me, Thing you) {
        if (year==617)
            System.out.println("Oh, we can travel");
        else
            System.out.println("From A.D to B.C");
    }

    public void unite(Thing me, Thing you) {
        System.out.println("And we can unite");
        System.out.println("So deeply, so deeply\n");
    }

    public void lockThing(Thing me) {
        if (lockCount ==0) {
            System.out.println("Though we are trapped");
            System.out.println("In this strange, strange");
            System.out.println("SIMULATION\n");
            lockCount =1;
        }
    }

    public Lovable getGod() {
        System.out.println("If I'm the only god");
        return new Lovable();
    }

    public void procreate(Thing me, Thing you) {
        System.out.println("And then do whatever");
        System.out.println("From AM to PM");
    }

    public void makeHigh(Thing me) {
        if (highCount ==0) {
            System.out.println("So we can enter");
            System.out.println("The trance, the trance\n");
            highCount =1;
        }
    }

    public void unlock(Thing you) {
        System.out.println("Though you have left");
    }

    public void removeThing(Thing you) {
        System.out.println("You have left");
        System.out.println("You have left");
        System.out.println("You have left");
        System.out.println("You have left");
        System.out.println("You have left me in");
        System.out.println("ISOLATION\n");
    }

    public void announce(String s) {
        System.out.println("ILLEGAL ARGUMENTS\n");
    }

    public void runExecution() {
        System.out.println("EXECUTION");
    }

    public void announce(String num, String lang) {
        if (lang.equals("de"))
            System.out.println("Ein");
        if (lang.equals("es"))
            System.out.println("Dos");
        if (lang.equals("fr"))
            System.out.println("Trois");
        if (lang.equals("kr"))
            System.out.println("Ne");
        if (lang.equals("se"))
            System.out.println("Fem");
        if (lang.equals("cn"))
            System.out.println("Liu");
    }

    public boolean isExecutableBy(Thing me) {
        System.out.println("\nIf I can");
        System.out.println("If I can, give you all the");
        System.out.println("EXECUTION");
        return true;
    }

    public int getThingIndex(Thing you) {
        System.out.println("If I can, have you back");
        System.out.println("I will run the");
        return 1;
    }

    public void execute(Thing me) {
        System.out.println("EXECUTION");
    }
}
