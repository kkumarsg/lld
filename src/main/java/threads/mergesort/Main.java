package threads.mergesort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort = List.of(8, 2, 4, 1, 9, 6, 0, 7);

        ExecutorService es = Executors.newFixedThreadPool(14);

        Sorter sorter = new Sorter(arrayToSort, es);
        Future<List<Integer>> submit = es.submit(sorter);
        List<Integer> sortedArray = submit.get();

        System.out.println("sortedArray = " + sortedArray);
        es.shutdown();



    }
}
