package com.akash.app.dao;

import com.akash.app.model.Database;
import com.akash.app.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private Connection connection;
    private String getQuery = "Select * from product ";
    private String getFilterQuery = "Select * from product where category = ?";
    private String getSingleQuery = "Select * from product where productid = ?";
    private String addproduct = "insert into product(userid,productname,price,description,about,category,producttype,image) values(?,?,?,?,?,?,?,?)";
    private String getCategory = "SELECT DISTINCT category FROM product;";

    //get All Product without user
    public List<Product> getProduct(int id){
        List<Product> products = new ArrayList<>();
        String getQuery = "SELECT * FROM product WHERE userid <> ?;";
        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement =  connection.prepareStatement(getQuery);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
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
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }


    //getting all product details
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>();
        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement =  connection.prepareStatement(getQuery);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
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
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }


    //add a product in product database
    public void addProduct(Product product){
       try {
           connection = Database.getInstance().getConnection();
           PreparedStatement statement = connection.prepareStatement(addproduct);
           statement.setString(1,String.valueOf(product.getUserid()));
           statement.setString(2,product.getName());
           statement.setString(3,product.getPrice());
           statement.setString(4,product.getDesc());
           statement.setString(5,product.getAbout());
           statement.setString(6,product.getCategory());
           statement.setString(7,product.getProductType());
           statement.setString(8,product.getImage());
           int success = statement.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    //getting Single Category Product
    public List<Product> getFilterProduct(String name){
        List<Product> list = new ArrayList<>();

        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getFilterQuery);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
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
                System.out.println(product.getName());
                list.add(product);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    //getting single product details
    public Product getOneProduct(String id){
        Product product = new Product();
        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getSingleQuery);
            statement.setString(1, String.valueOf(id));
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
               product.setProductid(rs.getInt(1));
               product.setUserid(rs.getInt(2));
               product.setName(rs.getString(3));
               product.setPrice(String.valueOf(rs.getString(4)));
               product.setDesc(rs.getString(5));
               product.setAbout(rs.getString(6));
               product.setCategory(rs.getString(7));
               product.setProductType(rs.getString(8));
               product.setImage(rs.getString(9));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    public List<String> getCategory(){
        List<String> list = new ArrayList<>();
        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getCategory);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                list.add(rs.getString(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public List<Product> getFilterProductByUser(int id,String name) {
        String getFilter = "Select * from product where category = ? and userid <> ?";
        List<Product> list = new ArrayList<>();
        try{
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(getFilter);
            statement.setString(1,name);
            statement.setInt(2,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
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
                System.out.println(product.getName());
                list.add(product);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }


    public List<Product> getContainsProduct(String inp) {
        List<Product> products = new ArrayList<>();

        for (Product p : getAllProduct()){
            if (p.getProductType().contains(inp)){
                products.add(p);
            }
        }
        return products;
    }
    public List<Product> getContainsUserProduct(String inp,int id) {
        List<Product> products = new ArrayList<>();

        for (Product p : getAllProduct()){
            if (p.getProductType().toLowerCase().contains(inp.toLowerCase()) && id != p.getUserid()){
                products.add(p);
            }
        }
        return products;
    }

    public int getProductId(String name) {
        String query = "select productid from product where productname = ?";
        int temp = 0;
        try {
            connection = Database.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                temp = rs.getInt(1);
                return temp;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return temp;
    }
}
