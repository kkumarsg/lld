package exceptions.batch1;

public class InvalidDivisorException extends Exception{

    /*
    Finally will always be executed, regardless of whether exception happens or not.
     */
    static void divide(int a, int b) throws InvalidDivisorException, NegativeDivisorException{
        if(b==0){
            throw new InvalidDivisorException();
        }
        if(b<0){
            throw new NegativeDivisorException();
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 3);
            /*
            1. open db connection
            2. try to execute a query -> threw an exception
             */
        } catch (InvalidDivisorException e) {

            throw new RuntimeException(e);
        } catch (NegativeDivisorException e) {

            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally executed");
        }
        throw new RuntimeException();
    }

}
