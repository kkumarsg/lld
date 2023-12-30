package collections.batch1;

import java.util.Comparator;

public class StudentSalaryComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // you've two things to compare
        // 1. this class object, other student.
        /*
          1. to treat both 'this' and 'other' object same, return 0
          2. to treat both 'this' and 'other' as 'this'<'other', return -1
          3. to treat both 'this' and 'other' as 'this'>'other', return 1
         */
        if(o1.salary==(o2.salary)){
            return 0;
        }
        if(o1.salary<o2.salary){
            return -1;
        }
        return 1;
    }
}
