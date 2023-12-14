package threads.basics;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world "+Thread.currentThread().getName());
    }
}
