package designpatterns.adapter;

public class YesBankAdapter implements BankApi{



    @Override
    public double getBalance() {

        System.out.println("Getting the balance in yes bank");
        // it's interacting with YesBank and getting me the response in the
        // desired format of my application
        return 0;
    }

    @Override
    public void transferFunds(String from, String to, Double amount) {
        // it's forming the request which will be sent to YesBank in the desired format
        System.out.println("Transferring the amount in yes bank");
    }
}
