package designpatterns.adapter;

public class Phonepe {

    private BankApi bankApi;

    public Phonepe(BankApi bankApi) {
        this.bankApi = bankApi;
    }

    public void performBankOperation(){

        bankApi.getBalance();
        bankApi.transferFunds("Keerthi", "Ujwal", 1000.0);

    }
}
