package design_pattern.prototype;

public class Student {
    static String univ = "BPUT";
    String name;
    String batch;


    public Student copy(){
        Student student = new Student();
        student.name = this.name;
        return student;
    }
}
