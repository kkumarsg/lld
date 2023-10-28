package runnable;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running the thread from anonymous class");
                System.out.println(Thread.currentThread().getName());
            }
        };

        Runnable runnable1 = ()->{
            System.out.println("Running the thread from anonymous class");
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable1);


        Thread thread1 = new Thread(()->{
            System.out.println("Running the thread from anonymous class");
            System.out.println(Thread.currentThread().getName());
        });

        thread.start();

        /*
        way 1
         */
        doSomething(10);

        /*
        way 2
         */
        int a = 10;
        doSomething(a);
    }

    static void doSomething(int a){
        System.out.println("Print "+a);
    }

}
