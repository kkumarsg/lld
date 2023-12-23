package generics.basics;

import java.util.HashMap;
import java.util.Map;

public class MainRawTypes {

    public static void main(String[] args) {

        // intend to store frequency of words;
        Map frequencyMap = new HashMap();

        frequencyMap.put("keerthi", 10);
        frequencyMap.put(20, "Neeraj");

        Integer neerajCount = (Integer) frequencyMap.get("Neeraj");
        System.out.println(neerajCount);

        Map<String, Integer> map = new HashMap<>();
        Integer keerthiCount = map.get("Keerthi");


    }
}
