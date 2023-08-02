public class Car implements Vehicle{

    @Override
    public void sound() {
        System.out.println("Bee bee");
    }

    @Override
    public void brake() {
        System.out.println("braking right now");
    }
}
