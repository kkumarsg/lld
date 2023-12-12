package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThree {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1; i<=100; i++){
            if(i==80){
                System.out.println("STOP");
            }
            PrintNumber printNumber = new PrintNumber(i);
            executorService.execute(printNumber);
        }
    }
}
