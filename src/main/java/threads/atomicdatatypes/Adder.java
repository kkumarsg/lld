package threads.atomicdatatypes;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    Value val;

    public Adder(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i<=50000; i++){
            val.value.addAndGet(i);
        }
        return null;
    }
}
