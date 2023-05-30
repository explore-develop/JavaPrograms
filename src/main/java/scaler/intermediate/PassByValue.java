package scaler.intermediate;

public class PassByValue {
    public static void main(String[] args) {
        Student s1 = new Student(18);
        Student s2 = new Student(15);
        int c = 10;
//        changeValue(c);
//        System.out.println(c);
//        abc(s1);
//        System.out.println(s1.age);
        swap(s1,s2);
        System.out.println(s1.age);
        System.out.println(s2.age);
    }

    static void  abc(Student s1){
        s1.age = 10;
    }

    static void changeValue(int val){
        val = 15;
    }

    static void swap(Student s3, Student s4){
        Student temp = s3;
        s3 = s4;
        s4 = temp;
    }
}
