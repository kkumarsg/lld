package threads.basics;

import java.util.concurrent.Callable;

public class Test {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Hello "+Thread.currentThread().getName());
        doSomething();

    }

    private static void doSomething() {
        int c = 30;
        int d = 40;
        System.out.println("Hello from dosomething "+Thread.currentThread().getName());
    }


}
