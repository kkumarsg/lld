//package designpatterns.builder;
//
//public class Builder {
//
//    private String name;
//    private int age;
//    private double psp;
//    private String universityName;
//    private String batch;
//    private Long id;
//    private int gradYear;
//    private String phoneNumber;
//
//    public String getName() {
//        return name;
//    }
//
//    public Builder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public Builder setPsp(double psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public Builder setUniversityName(String universityName) {
//        this.universityName = universityName;
//        return this;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public Builder setBatch(String batch) {
//        this.batch = batch;
//        return this;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public Builder setId(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public Builder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public Builder setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//        return this;
//    }
//
//    public Student build(){
//        // move all validations inside constructor to here maybe.
//        return new Student(this);
//    }
//}
