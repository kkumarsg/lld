package lambdas.batch1;

import java.util.function.*;

public class AppRunner {

    public static void main(String[] args) throws Exception {
        /*
         We cannot create an instance of interface
         (Reason: interfaces are not complete on their own, they can have abstract methods)
         */
        DemoClass way1 = new DemoClass();
        way1.fun();

        /*
        * Extra things
        * DemoInterface -> 1 abstract method.
        * DemoClass -> simply overriding the single method.
        * This is redundant, we can get away with this without creating Demo Class.
         */
        DemoInterface way2 = new DemoInterface() {
            @Override
            public void fun() {
                System.out.println("Anonymous class impl of fun");
            }
        };
        way2.fun();

        /*
        * Extra things
        * You're only passing a function on the right side above, nothing else.
        * For this, you've a lot of boiler plate code. Remove this.
         */

        /* Lambda
        method
        ip : ()
        body : System.out.println("Anonymous class impl of fun");
         */
        DemoInterface way3 = ()->{
            System.out.println("implementing fun using lambdas");
        };
        way3.fun();

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length()>10){
                    return true;
                }
                return false;
            }
        };

        System.out.println("predicate.test(\"Scaler\") = " + predicate.test("Scaler"));

        Predicate<String> predicate1 = (str)->{
            if(str.length()>10){
                return true;
            }
            return false;
        };

        Predicate<String> predicate2 = (str)->str.length()>10;

        System.out.println("predicate1.test(\"Scaler school\") = " + predicate1.test("Scaler school"));

        BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return s+s2;
            }
        };

        BiFunction<String, String, String> biFunction1 = (str1, str2)->{
            return str1+str2;
        };

        BiFunction<String, String, String> biFunction2 = (str1, str2)->str1+str2;

        System.out.println("biFunction1.apply(\"Hello \", \"World\") = " + biFunction1.apply("Hello ", "World"));

    }

    /*
     Break
     8:31:00
     8:40:00
     8:41:00
     */
}
