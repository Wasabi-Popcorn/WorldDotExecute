package popcorn;

import popcorn.things.*;

public class Thing implements PointSet, Circle, SineWave, Sequence, Eggplant, Tomato, TabbyCat {

    void addAttribute(Thing thing) {
    }

    Thing toAttribute() {
        return new Lovable();
    }

    void toggleCurrent() {
        System.out.println("Switch my current");
        System.out.println("To AC to DC");
    }

    void canSee(boolean b) {
        System.out.println("And then blind my vision");
    }

    void addFeeling(String feeling) {
        if (feeling.equals("dizzy"))
            System.out.println("So dizzy, so dizzy");
        else if (feeling.equals("complete")){
            System.out.println("Then I can");
            System.out.println("Then I can, finally be");
            System.out.println("COMPLETION");
        }
    }

    public int getNumStimulationsAvailable() {
        return 1;
    }

    public int getNumSimulationsNeeded() {
        System.out.println("If I can");
        System.out.println("If I can, give you all the");
        System.out.println("STIMULATIONS");
        return 0;
    }

    public Thing toSatisfaction() {
        return new Lovable();
    }

    public void setSatisfaction(Thing satisfaction) {
        System.out.println("Then I can");
        System.out.println("Then I can, be your only");
        System.out.println("SATISFACTION");
    }

    public int getFeelingIndex(String feeling) {
        System.out.println("If I can make you happy");
        return 1;
    }

    public void requestExecution(World world) {
        System.out.println("I will run the");
        System.out.println("EXECUTION");
    }

    void setProof(Thing thing) {
        System.out.println("Then you're the proof of my");
        System.out.println("EXISTENCE\n");
    }

    Thing toProof() {
        return new Lovable();
    }

    void toggleGender() {
        System.out.println("Switch my gender");
        System.out.println("To F to M");
    }

    void toggleRoleBDSM() {
        System.out.println("Oh switch my role");
        System.out.println("To S to M");
    }

    boolean getSenseIndex(String sense) {
        if (sense.equals("vibration")){
            System.out.println("If I can");
            System.out.println("If I can, feel your");
            System.out.println("VIBRATIONS");
        }
        return true;
    }

    void lookFor(Thing thing, World world) {
        /**
         * Taken care of in {@link World#removeThing(Thing)} method
         * KEKW
         */
    }

    Thing getMemory() {
        return new Lovable();
    }

    boolean isErasable() {
        System.out.println("If I can");
        System.out.println("If I can, erase all the pointless");
        System.out.println("FRAGMENTS");
        return true;
    }

    void removeFeeling(String feeling) {
        System.out.println("Then maybe");
        System.out.println("Then maybe, you won't leave me so");
        System.out.println("DISHEARTENED");
    }

    Thing getOpinionIndex(String opinion) {
        return new Lovable();
    }

    void setOpinion(Thing thing, boolean b) {
        System.out.println("Challenging your god");
        System.out.println("You have made some");
        throw new IllegalArgumentException();
    }

    public void escape(World world) {
        System.out.println("Though we are trapped");
        System.out.println("We are trapped ah\n");
    }

    public Thing toExecution() {
        return new Lovable();
    }

    public void setExecution(Object toExecution) {
        System.out.println("Then I can");
        System.out.println("Then I can, be your only");
        System.out.println("EXECUTION");
    }

    void learnTopic(String love) {
        System.out.println("I've studied");
        System.out.println("I've studied how to properly");
        System.out.println("LO-O-OVE");
    }

    void takeExamTopic(String love) {
        System.out.println("Question me");
        System.out.println("Question me I can answer all");
        System.out.println("LO-O-OVE");
    }

    void getAlgebraicExpression(String love) {
        System.out.println("I know the");
        System.out.println("algebraic expression of");
        System.out.println("LO-O-OVE");
    }

    void escape(String love) {
        System.out.println("Though you are free");
        System.out.println("I am trapped, trapped in");
        System.out.println("LO-O-OVE\n");
    }
}
