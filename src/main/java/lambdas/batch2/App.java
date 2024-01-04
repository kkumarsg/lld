package lambdas.batch2;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        /*
        I'm creating the DemoClass only because I want to access the methods inside DemoInterface
        Or, provide an implementation for them.
         */
        DemoClass way1 = new DemoClass();
        way1.fun();

        /*
        What if I could create an instance of interface itself -> DemoInterface ?
        Problem : DemoInterface is having an unimplemented method
         */
        DemoInterface way2 = new DemoInterface(){
            @Override
            public void fun() {
                System.out.println("Do nothing from anonymous class ");
            }
        };

        way2.fun();

        /*
        DemoInterface is a functional interface -> Having only one abstract method.
        Must and should ->
         1. What is the function taking -> Input parameters
         2. What is the function doing -> Body
         Just keep these -> Lambda
         */
        DemoInterface way3 = () -> {
            System.out.println("Do nothing from Lambda ");
        };

        way3.fun();

        // BREAK till 8:34:00

        /*
        WITH PARAMETERS
         */

        DemoInterfaceWithParameter way1WithParameter = new DemoInterfaceWithParameter() {
            @Override
            public void doSomething(int a) {
                System.out.println("print the number "+a);
            }
        };

        way1WithParameter.doSomething(5);

        DemoInterfaceWithParameter way2WithParameter = (a) -> {
            System.out.println("print the number "+a);
        };

        way2WithParameter.doSomething(5);


        // Predicate
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length()>10){
                    return true;
                }
                return false;
            }
        };

        System.out.println(predicate.test("Scaler"));

        // simplify predicate
        Predicate<String> predicate1 = (s)->{
            if(s.length()>10){
                return true;
            }
            return false;
        };
        System.out.println(predicate1.test("Scaler school"));

        // further simplify
        Predicate<String> predicate2 = (s)->{
            return s.length()>10;
        };
        System.out.println(predicate2.test("Scaler school"));

        // further simplify
        Predicate<String> predicate3 = s -> s.length()>10;
        System.out.println(predicate3.test("Scaler school"));

        // Please practice other functional interfaces...
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run from anonymous class ");
            }
        };

        Runnable runnable1 = ()->{
            System.out.println("Run from lambda ");
        };

        Runnable runnable2 = ()->System.out.println("Run from lambda "+Thread.currentThread().getName());
        Thread t1 = new Thread(runnable2);
        t1.start();
        // we can further optimise this ? ..
        int a = 5;
        doSomething(a);
        doSomething(5);

        Thread t2 = new Thread(()->System.out.println("Run from lambda "+Thread.currentThread().getName()));

        // one last thing, you can explore this.
//        Thread t3 = new Thread(System.out::print("Run from lambda"+Thread.currentThread().getName()));
    }

    static void doSomething(int a){

    }
}
