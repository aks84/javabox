public class HelloWorld implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Hello from child thread!");
        }
    }

    public static void main(String args[]) {
        Thread t = new Thread(new HelloWorld());
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Amulya Kumar Shahi (main thread)");
        }
    }
}
