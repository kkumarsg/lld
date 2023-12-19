package threads.synchronisedmethod;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    Value val;

    /*
    8:07:00, break till 8:17:00, we will start by 8:18:00
     */

    public Adder(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {

        for(int i=0; i<=50000; i++){
                val.incrementValue(i);
        }
        return null;
    }
}
