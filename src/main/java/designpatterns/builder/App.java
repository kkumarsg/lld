package designpatterns.builder;

import java.util.HashMap;
import java.util.Map;

public class App {


    public static void main(String[] args) {

        // this is prone to error.
//        Student student = new Student("keerthi", 21, 89.9, "PES", "April", 12l,
//                2020, "84752957489");


        Map<String, Object> properties = new HashMap<>();

        properties.put("name", "Keerthi");
//        properties.put("age", "20");
        properties.put("age", 20);

//        Student student1 = new Student(properties);
//
//        Builder builder = new Builder();
//        builder.setAge(21);
//        builder.setId(12l);
//        builder.setName("keerthi");

//        Student student2 = new Student(builder);

//        Builder builder1 = Student.getBuilder();
//        builder1.setAge(21);
//        builder1.setId(12l);
//        builder1.setName("keerthi");
//        Student build = builder1.build();

        Student studentSheela = Student.getBuilder()
                .setBatch("April")
                .setName("Sheela")
                .setPsp(93)
                .build();


        Student studentShubhadeep = Student.getBuilder()
                .setName("Shubhadeep")
                .setBatch("May")
                .build();


    }
}
