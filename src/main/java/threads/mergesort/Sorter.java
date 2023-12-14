package threads.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService es;

    public Sorter(List<Integer> arrayToSort, ExecutorService es) {
        this.arrayToSort = arrayToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        ArrayList<Integer> leftArrayToSort = new ArrayList<>();
        ArrayList<Integer> rightArrayToSort = new ArrayList<>();

        int mid = arrayToSort.size()/2;

        for(int i=0; i<mid; i++){
            leftArrayToSort.add(arrayToSort.get(i));
        }

        for(int i=mid; i<arrayToSort.size(); i++){
            rightArrayToSort.add(arrayToSort.get(i));
        }

        Sorter leftSorted = new Sorter(leftArrayToSort, es);
        Future<List<Integer>> sortedLeftArrayFuture =  es.submit(leftSorted);

        Sorter rightSorted  = new Sorter(rightArrayToSort, es);
        Future<List<Integer>> sortedRightArrayFuture = es.submit(rightSorted);

        // you force the thread to  wait till both the parts are sorted.
        List<Integer> sortedLeftArray = sortedLeftArrayFuture.get();
        List<Integer> sortedRightArray = sortedRightArrayFuture.get();

        ArrayList<Integer> sortedArray = new ArrayList<>();

        int i=0, j=0;

        while(i<sortedLeftArray.size() && j<sortedRightArray.size()){
            if(sortedLeftArray.get(i)<=sortedRightArray.get(j)){
                sortedArray.add(sortedLeftArray.get(i));
                i++;
            }
            else{
                sortedArray.add(sortedRightArray.get(j));
                j++;
            }
        }

        // left overs from any of the arrays
        while(i<sortedLeftArray.size()){
            sortedArray.add(sortedLeftArray.get(i));
            i++;
        }

        while(j<sortedRightArray.size()){
            sortedArray.add(sortedRightArray.get(j));
            j++;
        }

        return sortedArray;


    }
}
