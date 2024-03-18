package matsci.odia;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rakesh";
        s1.age = 15;
        s1.rollNo = 2;



        Student s2 = new Student();
        s2.name = "Aparna";
        s2.age = 14;
        s2.rollNo = 3;


        Student s3 = new Student();
        s3.name = "Abhishek";
        s3.age = 15;
        s3.rollNo = 2;


        Student s4 = new Student();
        s1.name = "Subham";
        s1.age = 15;
        s1.rollNo = 2;


        Student s5 = new Student();
        s1.name = "Gajendra";
        s1.age = 15;
        s1.rollNo = 2;


        s3.markAttendance();
        s3.markAttendance();
        s3.markAttendance();
        s3.getAge();
        s3.setAge(32);



        s1.attendLiveclass();
        s2.attendLiveclass();
        s3.showAttendance();
    }
}
