package generics.staticUnderstanding;

import generics.inheritance.Animal;
import generics.inheritance.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Friend<String> stringFriend = new Friend<>();
        stringFriend.something("Keerthi");

        System.out.println(stringFriend);

//        stringFriend.something(123);

        Friend.doSomethingElse("Keerthi");
        Friend.doSomethingElse(1234);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Friend.doSomethingElse(list);
        Friend.doSomethingElse(new HashMap<>());
    }
}
