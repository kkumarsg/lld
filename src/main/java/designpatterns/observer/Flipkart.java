package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers
            = new ArrayList<>();

    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

    public void orderPlaced(){

        // notify the subscribers
        for(OrderPlacedSubscriber orderPlacedSubscriber: orderPlacedSubscribers){
            orderPlacedSubscriber.announceOrderPlacement();
        }
    }

    void registerSubscriber(OrderPlacedSubscriber subscriber){
        orderPlacedSubscribers.add(subscriber);
    }

    void unregisterSubscriber(OrderPlacedSubscriber subscriber){
        orderPlacedSubscribers.remove(subscriber);
    }

    private Flipkart() {
    }
}
