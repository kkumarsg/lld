package streams.batch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsFilter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer sumOfNumbers = numbers.stream()
                .reduce(0, (sum, ele) -> {
                    return sum + ele;
                });

        Integer max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (currMax, ele) -> {
                    return Math.max(currMax, ele);
                });

        System.out.println("sumOfNumbers = " + sumOfNumbers);
        System.out.println("max = " + max);


        List<Integer> evenNumbers = new ArrayList<>();
        // let's filter out odd numbers
        for(Integer number :numbers){
            if(number%2==0){
                evenNumbers.add(number);
            }
        }

        System.out.println("evenNumbers = " + evenNumbers);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n1) {
                if(n1%2==0){
                    return true;
                }
                return false;
            }
        };

        List<Integer> evenNumbersStream = numbers.stream()
                .filter(n1 -> n1 % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> evenNumbersPredicate = numbers.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println("evenNumbersPredicate = " + evenNumbersPredicate);

        System.out.println("evenNumbersStream = " + evenNumbersStream);
    }
}
