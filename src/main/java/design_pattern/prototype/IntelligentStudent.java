package design_pattern.prototype;

public class IntelligentStudent extends Student {
    int intelligentQuoitent;

    public IntelligentStudent copy(){
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.name = this.name;
        return intelligentStudent;
    }
}
