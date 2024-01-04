package streams.batch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        // double the numbers

        /*
          USING FOR LOOP
         */
        ArrayList<Integer> doubleNumbers = new ArrayList<>();
        for(Integer number: numbers){
            doubleNumbers.add(number*2);
        }
        System.out.println("doubleNumbers = " + doubleNumbers);


        /*
         USING STREAMS
         */

        List<Integer> doubleNumbersWithStreams = numbers.stream()
                .map(ele -> ele * 2)
                .collect(Collectors.toList());

        System.out.println("doubleNumbersWithStreams = " + doubleNumbersWithStreams);
    }
}
