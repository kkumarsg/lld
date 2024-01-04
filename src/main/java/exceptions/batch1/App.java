package exceptions.batch1;

public class App {

    static double divide(int a, int b){

        /*
        1.
        2.
        3.
         */
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("divide(10, 2) = " + divide(10, 2));
        System.out.println("divide(20, 2) = " + divide(20, 2));
        System.out.println("divide(10, 0) = " + divide(10, 0));
    }
}
