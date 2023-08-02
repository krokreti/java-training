public class Main {

    int w;
    final int x = 5;
    int y = 10;
    public void myMethod() {
        System.out.println("What is happening now?");
    }

    public Main(int value) {
        w = value;
    }
    public static void main(String[] args) {
        Main myObject = new Main(5);
        System.out.println(myObject.x);
        myObject.y += 10;
        System.out.println(myObject.y);
        myObject.myMethod();
        System.out.println(myObject.w);
    }
}
