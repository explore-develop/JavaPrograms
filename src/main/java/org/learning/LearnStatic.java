package org.learning;

public class LearnStatic {
    static String name;
    int age;

    void getName(){
        System.out.println(name);
    }

//    static void testNonStaticCall(){
//        System.out.println(this.age); #java: non-static variable this cannot be referenced from a static context
//    }

}
