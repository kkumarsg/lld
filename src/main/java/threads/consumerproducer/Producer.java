package threads.consumerproducer;

public class Producer implements Runnable{

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    System.out.println("Produced ");
                    store.getItems().add(new Object());
                }
            }
        }
    }
}
