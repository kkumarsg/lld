package exceptions.batch1;

public class CheckedException {

    static void doSomething(int rollNo) throws ClassNotFoundException {

        if(rollNo>0){
            System.out.println("Student details ");
            return ;
        }
        doSomethingElse();

    }

    static void doSomethingElse() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        doSomething(-10);
    }
}
