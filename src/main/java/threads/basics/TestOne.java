package threads.basics;

public class TestOne {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);

        System.out.println("Hi "+Thread.currentThread().getName());
        t.start();
    }
}
