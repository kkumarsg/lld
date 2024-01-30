package designpatterns.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator() {

        Flipkart.getInstance().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlacement() {
        System.out.println("Generating invoice ");
    }
}
