package designpatterns.adapter;

public interface BankApi {

    double getBalance();
    void transferFunds(String from, String to, Double amount);
}
