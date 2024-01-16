package designpatterns.builder;

import java.util.Map;

public class Student {

    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private Long id;
    private int gradYear;
    private String phoneNumber;

    /*
     1. So many constructors
     2. At some point constructor overloading is not even possible.
     */

//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Student(int age, double psp) {
//        this.age = age;
//        this.psp = psp;
//    }

//    public Student(String batch, Long id) {
//        this.batch = batch;
//        this.id = id;
//    }
//
//    public Student(String phoneNumber, Long id) {
//        this.phoneNumber = phoneNumber;
//        this.id = id;
//    }

//    public Student(String name, int age, double psp, String universityName, String batch, Long id, int gradYear, String phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.psp = psp;
//        this.universityName = universityName;
//        this.batch = batch;
//        this.id = id;
//        this.gradYear = gradYear;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Student(Map<String, Object> map){
//        /*
//         1. we're only setting 2-3 properties
//         */
//        if(map.containsKey("name")){
//            this.name = (String)map.get("name");
//        }
//        if(map.containsKey("age")){
//            this.age = (int)map.get("age");
//        }
//    }

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){

        // add any validations that you want.
        if(builder.getName()!=null) {
            this.name = builder.getName();
        }
        if(builder.getId()!=null){
            this.id = builder.getId();
        }

        // --- and so on.
    }



    public static class Builder {

        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private Long id;
        private int gradYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build(){
            // move all validations inside constructor to here.
            return new Student(this);
        }
    }
}
