package threads.consumerproducer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store(5);

        for(int i=0; i<8; i++){
            Producer producer = new Producer(store);
            es.execute(producer);
        }

        for(int i=0; i<20; i++){
            Consumer consumer = new Consumer(store);
            es.execute(consumer);
        }

        es.shutdown();
    }
}
