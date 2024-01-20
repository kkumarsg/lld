package designpatterns.prototypeandregistry;

import java.util.HashMap;
import java.util.Map;

// make this registry generic
public class StudentRegistry {

    private Map<String, Student> map = new HashMap<>();

    void register(String key, Student student){
        map.put(key, student);
    }

    Student get(String key){
        return map.get(key);
    }
}
