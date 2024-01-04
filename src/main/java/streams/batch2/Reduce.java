package streams.batch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        // find the sum

        /*
          USING FOR LOOP
         */
        int sum = 0;
        for(Integer number: numbers){
           sum = sum+number;
        }
        System.out.println("sum = " + sum);

        /*
        USING STREAMS
         */

        Integer sumWithReduce = numbers.stream()
                .reduce(0, (curr_sum, ele) -> curr_sum + ele);

        System.out.println("sumWithReduce = " + sumWithReduce);


        /*
        --------------------------------------------------------------------------
                    FINDING THE MAX ELEMENT
        --------------------------------------------------------------------------
         */

        /*
        USING FOR LOOP
         */

        int maxEle = Integer.MIN_VALUE;
        for(Integer number: numbers){
            maxEle = Math.max(maxEle, number);
        }

        System.out.println("maxEle = " + maxEle);

        /*
        USING STREAMS
         */

        Integer maxWithReduce = numbers.stream()
                .reduce(Integer.MIN_VALUE,
                        (curr_max, ele) -> Math.max(curr_max, ele));

        System.out.println("maxWithReduce = " + maxWithReduce);

    }
}
