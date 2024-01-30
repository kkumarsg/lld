package designpatterns.observer;

public class WarehouseManagement implements OrderPlacedSubscriber{

    public WarehouseManagement() {
        Flipkart.getInstance().registerSubscriber(this);
    }

    @Override
    public void announceOrderPlacement() {
        System.out.println("Warehouse data updating ");
    }
}
