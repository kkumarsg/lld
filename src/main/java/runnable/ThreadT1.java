package runnable;

public class ThreadT1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
