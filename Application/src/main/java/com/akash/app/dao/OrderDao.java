package com.akash.app.dao;

import com.akash.app.model.Database;
import com.akash.app.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    private Connection connection;
    private String addQuery = "insert into ordertable(userid,productid) values(?,?)";
    private String getOrders = "select productid from ordertable where userid = ?";
    public void addOrder(int userId,int productId){
        try{
           connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(addQuery);
            statement.setInt(1,userId);
            statement.setInt(2,productId);
            int num = statement.executeUpdate();
            System.out.println(num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Product> getOrderList(int userId){
        List<Integer> orders = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getOrders);
            statement.setInt(1,userId);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                orders.add(id);
            }
            products = gettingProduct(orders);
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

    private List<Product> gettingProduct(List<Integer> orders) {
        List<Product> products = new ArrayList<>();
        try{
            connection = Database.getInstance().getConnection();
            for (int i =0;i<orders.size();i++){
                int id = orders.get(i);
                String Orders = "select * from product where productid = ?";
                PreparedStatement statement1 = connection.prepareStatement(Orders);
                statement1.setInt(1,id);
                ResultSet rs = statement1.executeQuery();
                if (rs.next()){
                    Product product = new Product();
                    product.setProductid(rs.getInt(1));
                    product.setUserid(rs.getInt(2));
                    product.setName(rs.getString(3));
                    product.setPrice(rs.getString(4));
                    product.setDesc(rs.getString(5));
                    product.setAbout(rs.getString(6));
                    product.setCategory(rs.getString(7));
                    product.setProductType(rs.getString(8));
                    product.setImage(rs.getString(9));
                    products.add(product);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
}
