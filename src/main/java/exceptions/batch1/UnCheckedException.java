package exceptions.batch1;

public class UnCheckedException {

    static void doSomething(int rollNo)  {

        if(rollNo>0){
            System.out.println("Student details ");
            return ;
        }
        throw new IndexOutOfBoundsException();

    }

    public static void main(String[] args)  {
        doSomething(-10);
    }
}
