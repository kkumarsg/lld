package lambdas.batch2;


@FunctionalInterface
public interface DemoInterface {

    void fun();

    default void fun1(){
        System.out.println("Thi sis demo of functioal interface");
    }

    default void fun3(){
        System.out.println("Thi sis demo of functioal interface");
    }

    static void fun2(){
        System.out.println("Hello, from static ");
    }
}
