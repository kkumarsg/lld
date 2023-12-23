package generics.inheritance;

public class Cat extends Mammal implements Eater{

    @Override
    public void eat(){
        System.out.println("eating from cat ");
    }
}
