package threads.atomicdatatypes;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value value = new Value();

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> adderFuture = es.submit(adder);
        Future<Void> substractorFuture = es.submit(subtractor);

        adderFuture.get();
        substractorFuture.get();

        System.out.println("value.value = " + value.value);

        es.shutdown();
    }
}
