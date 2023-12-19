package threads.atomicdatatypes;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    Value val;

    public Subtractor(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i<=50000; i++){
            val.value.addAndGet(-i);
        }
        return null;
    }
}