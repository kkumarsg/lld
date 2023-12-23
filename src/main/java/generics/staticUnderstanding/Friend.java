package generics.staticUnderstanding;

public class Friend<T>{

    public void something(T t){
        System.out.println("Printing t from non static "+t);
    }

    public static <U> void doSomethingElse(U u){
        System.out.println("Printing u from static "+u);
    }

//    @Override
//    public String toString(){
//        return "Print friend from toString";
//    }

}
