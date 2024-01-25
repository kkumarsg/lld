package designpatterns.adapter;

public class App {

    public static void main(String[] args) {

        Phonepe phonepe = new Phonepe(new IciciBankAdapter());
        phonepe.performBankOperation();
    }
}
