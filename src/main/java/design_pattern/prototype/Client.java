package design_pattern.prototype;

public class Client {
    public static void main(String[] args) {
        IntelligentStudent student = new IntelligentStudent();
        Student student2 = new IntelligentStudent();
        Student student1 = student.copy();
//        IntelligentStudent intelligentStudent = student2.copy(); //Error
        System.out.println(Student.univ);
    }
}
