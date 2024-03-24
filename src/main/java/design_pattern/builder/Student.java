package design_pattern.builder;

public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNum;


    public static Builder getBuilder(){
        return new Builder();
    }


     private Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
    }

   public static class Builder { // Inner Class
        String name;
        int age;
        String univName;
        double psp;
        String batch;
        int gradYear;
        String phoneNum;

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

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNum() {
            return phoneNum;
        }

        public Builder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }

        public Student build(){
            if(this.getAge() < 20){
                throw new RuntimeException("Age cannot me less than 20");
            }
            return new Student(this);
        }

    }
}
