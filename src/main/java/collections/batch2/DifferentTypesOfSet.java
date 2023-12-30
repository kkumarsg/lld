package collections.batch2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


/*
Same difference for map
 */
public class DifferentTypesOfSet {

    public static void main(String[] args) {

        HashSet<Integer> integerHashSet = new HashSet<>();
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        for(int i=0; i<1000; i=i+10){
            integerHashSet.add(1000-i);
            integerLinkedHashSet.add(1000-i);
            integerTreeSet.add(1000-i);
        }

        System.out.println("integerLinkedHashSet = " + integerLinkedHashSet);
        System.out.println("integerHashSet = " + integerHashSet);
        System.out.println("integerTreeSet = " + integerTreeSet);
    }
}
