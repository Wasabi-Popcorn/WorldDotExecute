package popcorn.things.test;

public class Main {
    private static Child child = new Child() {
    };
    private static Two Two = new Two() {
    };

    public static void main(String[] args) {
        assert child!=null;
        System.out.println(child instanceof Two);
        System.out.println(child instanceof One);
        System.out.println(Two instanceof Child);
    }
}
