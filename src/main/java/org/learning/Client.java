package org.learning;

public class Client {
    public static void main(String[] args) {
//        LearnStatic.name = "Santosh";
//        LearnStatic learnStatic = new LearnStatic();
//        learnStatic.getName();

        FinalKeyword finalKeyword = new FinalKeyword(2);
        finalKeyword.printA();
        finalKeyword = new FinalKeyword(34);
        finalKeyword.printA();
    }
}
