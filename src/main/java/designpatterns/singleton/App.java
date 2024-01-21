package designpatterns.singleton;

public class App {

    public static void main(String[] args) {

        DatabaseConnectionV1 db1 = new DatabaseConnectionV1();
        DatabaseConnectionV1 db2 = new DatabaseConnectionV1();

//        new DatabaseConnectionV2() ; private constructor

//        DatabaseConnectionV3.getInstance(); not possible if the method is not static

        DatabaseConnectionV3 db3 = DatabaseConnectionV3.getInstance();
        DatabaseConnectionV3 db4 = DatabaseConnectionV3.getInstance();


        // working non threaded singleton
        DatabaseConnectionV4 db5 = DatabaseConnectionV4.getInstance();
        DatabaseConnectionV4 db6 = DatabaseConnectionV4.getInstance();
        System.out.println("Hello");

        DatabaseConnectionV7 instance1 = DatabaseConnectionV7.getInstance();
        DatabaseConnectionV7 instace2 = DatabaseConnectionV7.getInstance();



    }
}
