package threads.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThree {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1; i<=10000; i++){
            Thread.sleep(1000);
            if(i==8000){
                System.out.println("Sai");
            }
            PrintNumber printNumber = new PrintNumber(i);
            executorService.execute(printNumber);
        }
    }
}
