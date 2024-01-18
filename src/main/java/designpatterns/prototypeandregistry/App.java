package designpatterns.prototypeandregistry;

public class App {

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student ujwal = studentRegistry.get("aprilBatch23").clone();
        ujwal.setAge(20);
        ujwal.setStudentPsp(95);
        ujwal.setName("Ujwal");

        Student abhiram = studentRegistry.get("aprBatchIntelligentStudent23").clone();
        abhiram.setName("Abhiram");
        abhiram.setAge(25);
        abhiram.setStudentPsp(98);

        System.out.println("ujwal = " + ujwal.getBatch());
        System.out.println("abhiram = " + abhiram.getBatch());
    }

    private static void fillRegistry(StudentRegistry studentRegistry) {

        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr 23");
        aprBatchStudent.setAverageBatchPsp(90.0);

        studentRegistry.register("aprilBatch23", aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setIq(180);
        aprBatchIntelligentStudent.setBatch("Apr 23");
        aprBatchIntelligentStudent.setAverageBatchPsp(90.0);

        studentRegistry.register("aprBatchIntelligentStudent23", aprBatchIntelligentStudent);

    }
}
