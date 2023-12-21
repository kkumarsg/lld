package threads.consumerproducer;

public class Consumer implements Runnable{

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    System.out.println("Consumed ");
                    store.getItems().remove(store.getItems().size() - 1);
                }
            }
        }
    }
}
