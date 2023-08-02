public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        Car car = new Car();
        car.sound();
        car.brake();
        System.out.println(Size.SMALL);
        for (Size size: Size.values()
             ) {
            System.out.println(size);
        }
    }
}
