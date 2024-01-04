package exceptions.batch2;

public class Error {

    /*
      resume 8:23:00
     */

    static void doSomething(int a){
        doSomething(a*a);
    }

    public static void main(String[] args) {
        doSomething(10);
    }
}
