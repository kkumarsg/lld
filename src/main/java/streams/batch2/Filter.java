package streams.batch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        // filter odd numbers

        /*
          USING FOR LOOP
         */
        ArrayList<Integer> evenNumbersFor = new ArrayList<>();
        for(Integer number: numbers){
            if(number%2==0){
                evenNumbersFor.add(number);
            }
        }
        System.out.println("evenNumbersFor = " + evenNumbersFor);

        /*
         USING STREAMS FILTER METHOD
         */

        List<Integer> evenNumbersStream = numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("evenNumbersStream = " + evenNumbersStream);


    }
}
