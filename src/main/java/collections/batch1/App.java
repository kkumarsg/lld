package collections.batch1;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class App {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();


        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Student("chaitanya", 80, 60));
        priorityQueue.add(new Student("sanjana", 90, 70));
        priorityQueue.add(new Student("sonal", 100, 90));

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().name);
        }


        /*
            1. implement comparable interface
            2. pass a class which implements comparator.
         */

//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        integerArrayList.add(20);
//        integerArrayList.add(10);
//        integerArrayList.add(40);
//        integerArrayList.add(50);
//
//        Collections.sort(integerArrayList);
//
//        for(Integer ele: integerArrayList){
//            System.out.println(ele +" ");
//        }
    }
}
