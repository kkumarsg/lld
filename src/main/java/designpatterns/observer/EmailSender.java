package designpatterns.observer;

public class EmailSender implements OrderPlacedSubscriber{

    public EmailSender() {

        Flipkart.getInstance().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlacement() {
        System.out.println("Sending emails ");
    }
}
