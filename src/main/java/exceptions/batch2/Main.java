package exceptions.batch2;

public class Main {

    static void printStudent(int rollNo) throws NullPointerException{
        if(rollNo>0){
            System.out.println("Student is this guy "+rollNo);
            return;
        }
        // throw an exception, because rollNumber cannot be negative
        throw new NullPointerException();
    }

    static void getStudent(int rollNo) throws ClassNotFoundException {
        if(rollNo>0){
            System.out.println("Student is this guy "+rollNo);
            return;
        }
        // throw an exception, because rollNumber cannot be negative
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        getStudent(-2);
        printStudent(-10);
    }
}
