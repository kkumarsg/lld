package generics.basics;

import java.util.ArrayList;
import java.util.List;

public class MainObject {

    public static void main(String[] args) {

        // I intend to store persons as strings and relation as number in listOne
        List<Object> listOne = new ArrayList<>();
        listOne.add(new Friend("X", "Y", 1));
        listOne.add(new Friend(1, 2, "CLOSE")); // intention is lost

        Friend friend = (Friend) listOne.get(1);
        Integer relation = (Integer) friend.relation;

        System.out.println("relation is "+relation);
    }
}
