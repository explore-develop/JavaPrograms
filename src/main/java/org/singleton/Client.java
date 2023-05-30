package org.singleton;

public class Client {
    public static void main(String[] args) {
        DbConnection instance1 = DbConnection.instance;
        DbConnection instance2 = DbConnection.instance;
        System.out.println(instance1);
        System.out.println(instance2);
    }

}
