package collections.batch1;

public class Student implements Comparable<Student>{

    String name;
    int psp;
    int salary;

    public Student(String name, int psp, int salary) {
        this.name = name;
        this.psp = psp;
        this.salary = salary;
    }

    @Override
    public int compareTo(Student other) {
        // you've two things to compare
        // 1. this class object, other student.
        /*
          1. to treat both 'this' and 'other' object same, return 0
          2. to treat both 'this' and 'other' as 'this'<'other', return -1
          3. to treat both 'this' and 'other' as 'this'>'other', return 1
         */
        if(this.psp==(other.psp)){
            return 0;
        }
        if(this.psp<other.psp){
            return -1;
        }
        return 1;
    }
}
