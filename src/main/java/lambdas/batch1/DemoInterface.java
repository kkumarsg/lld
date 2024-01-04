package lambdas.batch1;

@FunctionalInterface
public interface DemoInterface {

    void fun();

    private void fun1(){
        int a = 1/0;
    }

    default void func2(){
        System.out.println("Default behaviour");
    }
}
