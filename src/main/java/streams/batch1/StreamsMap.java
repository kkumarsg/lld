package streams.batch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsMap {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 4);

        List<Integer> doubleNumbers = new ArrayList<>();
        // let's filter out odd numbers
        for(Integer number :numbers){
           doubleNumbers.add(number*2);
        }

        System.out.println("doubleNumbers = " + doubleNumbers);

        Function<Integer, Integer> doubler = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        List<Integer> doublersListWithLamdaStreams = numbers.stream()
                .map(n1 -> n1*2)
                .collect(Collectors.toList());

        List<Integer> doublersWithFunction = numbers.stream()
                .map(doubler)
                .collect(Collectors.toList());

        System.out.println("doublersWithFunction = " + doublersWithFunction);

        System.out.println("doublersListWithLamdaStreams = " + doublersListWithLamdaStreams);


        System.out.println(numbers.stream().map(n1 -> n1 * 3).collect(Collectors.toSet()));
    }
}
