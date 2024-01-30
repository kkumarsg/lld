package designpatterns.observer;

public class Client {

    public static void main(String[] args) {

        Flipkart flipkart = Flipkart.getInstance();

        EmailSender emailSender = new EmailSender();
        WarehouseManagement warehouseManagement = new WarehouseManagement();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        flipkart.orderPlaced();

    }
}
