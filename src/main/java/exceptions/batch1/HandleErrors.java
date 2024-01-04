package exceptions.batch1;

public class HandleErrors {

    static void doubler(int a){
        doubler(a*a);
    }

    public static void main(String[] args) {
        try {
            doubler(2);
        }
        catch (StackOverflowError e){

        }
    }
}
