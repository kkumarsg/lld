package threads.syncissue;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    Value val;

    public Subtractor(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<=50000; i++){
            val.value -= i;
        }
        return null;
    }
}