package generics.inheritance;

import java.util.ArrayList;
import java.util.HashMap;

public class Mammal extends Animal{

    public static void main(String[] args) {

        // [1,2,3,4]
        //        i
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for(Integer number: numbers){
            numbers.remove(0);
            System.out.println(number);
            numbers.add(123);
        }
    }
}
