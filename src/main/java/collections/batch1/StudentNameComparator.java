package collections.batch1;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        // you've two things to compare
        // 1. this class object, other student.
        /*
          1. to treat both 'this' and 'other' object same, return 0
          2. to treat both 'this' and 'other' as 'this'<'other', return -1
          3. to treat both 'this' and 'other' as 'this'>'other', return 1
         */
        if(o1.name.length()==o2.name.length()){
            return 0;
        }
        if(o1.name.length()<o2.name.length()){
            return -1;
        }
        return 1;
    }
}
