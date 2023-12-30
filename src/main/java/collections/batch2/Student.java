package collections.batch2;

public class Student implements Comparable<Student>{

    int id;
    String name;
    Long salary;

    public Student(int id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    @Override
    public int compareTo(Student other) {

        if(this.name.length()==other.name.length()){
            return 0;
        }
        if(this.name.length()<other.name.length()){
            return -1;
        }
        return 1;
    }
}
