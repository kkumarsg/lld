package threads.synchronisedmethod;

public class Value {
    private int value = 0;

    public int getValue() {
        return value;
    }

    synchronized public void incrementValue(int i){
        /*
        Read the value
        Do the calculations -> value+i
        Update the value
         */
        value = value+i;
    }

    synchronized public void decrementValue(int i){
        value = value-i;
    }
}
