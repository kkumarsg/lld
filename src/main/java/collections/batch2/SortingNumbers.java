package collections.batch2;

import java.util.ArrayList;
import java.util.Collections;

public class SortingNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(34);
        numbers.add(45);
        numbers.add(12);

        System.out.println("numbers = " + numbers);

        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);

    }
}
