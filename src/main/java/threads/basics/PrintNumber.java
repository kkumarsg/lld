package threads.basics;

public class PrintNumber implements Runnable{

    int number;

    public PrintNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number+" Printed by "+Thread.currentThread().getName());
    }
}
