package org.learning;

public class MySQLDatabase extends Database{

    public void getStoredProcedures(){
        System.out.println("No SP Found");
    }

    @Override
    Database connect() {
        System.out.println("MysQL Connection Established");
        return null;
    }
}
