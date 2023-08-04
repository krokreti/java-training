public class Main extends Thread{

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("This code is outside of the thread.");
        Thread thread1 = new Thread(thread);
        thread1.start();
        while(thread1.isAlive()) {
            System.out.println("Waiting...");
        }

        String words = "One Two Three Four five";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
