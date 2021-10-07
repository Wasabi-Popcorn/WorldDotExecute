package popcorn.things.test;

public interface One {
    default void methOne(){
        System.out.println("from method one");
    }
    void nonDefault();
}
