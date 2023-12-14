package threads.mergesort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort = List.of(8, 2, 4, 1, 9, 6, 0, 7);

        ExecutorService es = Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(arrayToSort, es);
        List<Integer> sortedArray = sorter.call();

        System.out.println("sortedArray = " + sortedArray);
        es.shutdown();



    }
}
