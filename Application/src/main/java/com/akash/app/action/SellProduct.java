package com.akash.app.action;

import com.akash.app.dao.ProductDao;
import com.akash.app.dao.SellDao;
import com.akash.app.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@MultipartConfig
@WebServlet("/sellproduct")
public class SellProduct extends HttpServlet {
    private Product product;
    private ProductDao getProduct;
    private SellDao sellDao;
    private String Path = "D:/Application/Application/src/main/webapp/images/";
    private String uploadPath = "D:/Application/Olx/Application/src/main/webapp/images/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        product = new Product();
        sellDao = new SellDao();
        getProduct = new ProductDao();
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
        if (session.getAttribute("userId") == null){
            PrintWriter pw = resp.getWriter();
            pw.println("Please Login And Order Something");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req,resp);
        }
        product.setUserid((int)session.getAttribute("userId"));
        product.setName(req.getParameter("name"));
        product.setPrice(req.getParameter("price"));
        product.setAbout(req.getParameter("about"));
        product.setDesc(req.getParameter("description"));
        product.setCategory(req.getParameter("category"));
        product.setProductType(req.getParameter("producttype"));
        Part file = req.getPart("image");
        product.setImage(file.getSubmittedFileName());
        try (InputStream inputStream = file.getInputStream();
             OutputStream outputStream = new FileOutputStream(new File(uploadPath + product.getImage()))) {
            int bytesRead;
            final byte[] buffer = new byte[1024];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        getProduct.addProduct(product);
        int id = getProduct.getProductId(product.getName());
        sellDao.addSellProduct(product.getUserid(),id);
        System.out.println("success");
        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);
    }
}
