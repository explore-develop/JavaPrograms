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


        s1.attendLiveclass();
        s2.attendLiveclass();
    }
}
