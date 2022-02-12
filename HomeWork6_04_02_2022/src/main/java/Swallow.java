public class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Ласточка полетела...");
    }
}
