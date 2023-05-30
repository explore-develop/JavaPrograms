package org.singleton;


public  class DbConnection {

    public static final DbConnection instance = new DbConnection();

    private DbConnection() {
    }

//    public static DbConnection getInstance() {
//        if (instance == null) {
//            instance = new DbConnection();
//        }
//        return instance;
//    }

}
