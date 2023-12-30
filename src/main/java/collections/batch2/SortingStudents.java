package collections.batch2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudents {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "yash", 20l));
        students.add(new Student(2, "Dil", 30l));
        students.add(new Student(1, "Abhiram", 40l));

        // comparator
//        Collections.sort(students, new StudentIdComparator());

//        Collections.sort(students, new StudentSalaryComparator());

        Collections.sort(students);

        for(Student student: students){
            System.out.println("student.name = " + student.name);
        }
    }

}

class StudentIdComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
       if(s1.id==s2.id){
           return 0;
       }
       if(s1.id<s2.id){
           return -1;
       }
       return 1;
    }
}

class StudentSalaryComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.salary==s2.salary){
            return 0;
        }
        if(s1.salary<s2.salary){
            return -1;
        }
        return 1;
    }
}