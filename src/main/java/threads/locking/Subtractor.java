package threads.locking;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    Value val;
    Lock lock;

    public Subtractor(Value val, Lock lock) {
        this.val = val;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i<=50; i++){
            lock.lock();
            System.out.println("Requesting lcok for Subtractor "+i);
            Thread.sleep(1000);
            val.value -= i;
            System.out.println("Subtractor "+i);
            System.out.println("val.value = " + val.value);
            lock.unlock();
        }
        return null;
    }
}