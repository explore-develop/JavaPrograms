package org.learning;

public abstract class Database {
    private String name;
    private String host;
    private int port;

    abstract Database connect();
}
