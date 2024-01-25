package designpatterns.adapter;

public class IciciBankAdapter implements BankApi{
    @Override
    public double getBalance() {

        System.out.println("Getting the balance from icici");
        // it's interacting with IciciBank and getting me the response in the
        // desired format of my application
        return 0;
    }

    @Override
    public void transferFunds(String from, String to, Double amount) {
        // it's forming the request which will be sent to IciciBank in the desired format
        System.out.println("Transferring the amount in icici ");
    }
}
