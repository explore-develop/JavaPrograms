package matsci.odia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    int age;
    int rollNo;
    String name;

    int attendance = 0;


    void attendLiveclass(){
        System.out.println(this.name + " Is Attending live class");
    }

    void markAttendance(){
        this.attendance += 1;
    }

    void showAttendance(){
        System.out.println("Student " + this.name + " has attended " + this.attendance + " classes");
    }


}
