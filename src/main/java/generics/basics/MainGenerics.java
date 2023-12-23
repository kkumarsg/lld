package generics.basics;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {

    public static void main(String[] args) {

        Friend<String, Integer> friend = new Friend<>("X", "Y", 1);
//        Friend<String, Integer> friendOne = new Friend<>("X", "Y", "CLOSE");

        // raw types
        Friend friend1 = new Friend("x", "y", "close");
        Friend friend2 = new Friend("x", "y", 2);



        List<Friend<String, Integer>> listOne = new ArrayList<>();
        listOne.add(new Friend<>("X", "Y", 10));
//        listOne.add(new Friend<>(1, 2, "CLOSE"));

        List<Friend<Integer, String>> listTwo = new ArrayList<>();
        listTwo.add(new Friend(1, 2, "ENEMIES"));
//        listTwo.add(new Friend<>("Keerthi", "Deepak", "CLOSE"));



    }
}
