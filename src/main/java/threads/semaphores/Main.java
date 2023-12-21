package threads.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Store store = new Store(5);

        Semaphore producerSema = new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);

        for(int i=0; i<8; i++){
            Producer producer = new Producer(store, producerSema, consumerSema);
            es.execute(producer);
        }

        for(int i=0; i<20; i++){
            Consumer consumer = new Consumer(store, producerSema, consumerSema);
            es.execute(consumer);
        }

        es.shutdown();
    }
}
