public class Eagle extends FlyingBird {

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Орел полетел...");
    }
}
