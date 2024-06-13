package com.akash.app.dao;

import com.akash.app.model.Database;
import com.akash.app.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    private String getSingleUser = "select * from user where id = ?";
    private String addUser = "insert into user(username,email,password,address,mobileNo) values(?,?,?,?,?)";
    private Connection connection;
    private String getUser = "select id,email,password from user where email = ?";

    public int isValidUser(String email, String password) {
        try {
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getUser);
            statement.setString(1,email);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                if (rs.getString(2).equals(email)){
                    if (rs.getString(3).equals(password)){
                        return id;
                    }else {
                        return -1;
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public User getUser(int id) {
        User user = new User();
        try {
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getSingleUser);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                user.setUserId(rs.getInt(1));
                user.setUserName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setAddress(rs.getString(5));
                user.setMobileno(rs.getString(6));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public void addUser(User user) {
       try {
           connection = Database.getInstance().getConnection();
           PreparedStatement statement = connection.prepareStatement(addUser);
           statement.setString(1,user.getUserName());
           statement.setString(2,user.getEmail());
           statement.setString(3,user.getPassword());
           statement.setString(4,user.getAddress());
           statement.setString(5,user.getMobileno());
           int num = statement.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
