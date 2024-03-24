package design_pattern.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Santa");
//        builder.setAge(34);
//        builder.setPsp(32.12);
//        builder.setGradYear(2020);
//        builder.setPhoneNum("79803900132");
//        builder.setBatch("MWF Evening");
//
////        Student student = new Student(builder);
//        Student student = builder.build();

//        System.out.println(student);

        Student student = Student.getBuilder()
                .setName("Santosh")
                .setAge(12)
                .setPhoneNum("9408442714")
                .setBatch("MWF Evening")
                .setGradYear(2020)
                .build();
        System.out.println(student);
    }
}
