package exceptions.batch2;

public class HandleException {

    public static void main(String[] args) {

        int a = 200;

        try {
            doSomething(a);
            return ;
        } catch (NegativeValueException e) {
            System.out.println("An exception is thrown "+e);
            a = a*-1;
            System.out.println("Now a value is positive "+a);
        } catch (ZeroValueForA e) {
            System.out.println("An exception is thrown "+e);
            a = 1;
            System.out.println("Now a value is positive "+a);
        } catch (CenturyException e) {
            System.out.println("An exception is thrown "+e);
        } finally {
            System.out.println("This will always be executed ");
        }


    }

    static void doSomething(int a) throws NegativeValueException, ZeroValueForA, CenturyException {
        if(a<0){
            throw new NegativeValueException();
        }
        if(a==0){
            throw new ZeroValueForA();
        }
        if(a==100){
            throw new CenturyException();
        }
//        throw new NullPointerException();
        System.out.println("A value is "+a);
    }
}
