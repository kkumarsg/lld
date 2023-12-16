package threads.locking;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value();

        Lock lock = new ReentrantLock(true);

        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> adderFuture = es.submit(adder);
        Future<Void> substractorFuture = es.submit(subtractor);

        adderFuture.get();
        substractorFuture.get();

        System.out.println("value.value = " + value.value);

        es.shutdown();
    }
}
