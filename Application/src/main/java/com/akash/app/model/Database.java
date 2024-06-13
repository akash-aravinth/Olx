package com.akash.app.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException c ) {
            c.printStackTrace();
        }
    }
    private Connection connection;
    private String hostName = "jdbc:mysql://localhost:3306/olx";
    private String dbName = "root";
    private String dbPassword = "Akash@2002";
    private static Database database;
    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }
    public Connection getConnection(){
        try{
            connection = DriverManager.getConnection(hostName,dbName,dbPassword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
