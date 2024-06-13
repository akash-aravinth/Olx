package com.akash.app.action;

import com.akash.app.dao.ProductDao;
import com.akash.app.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/showcategory")
public class ShowCategory extends HttpServlet {
    private ProductDao productDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productDao = new ProductDao();
        String name = req.getParameter("value");
        List<Product> products = new ArrayList<>();
        HttpSession session = req.getSession();
        if (session.getAttribute("userId") == null){
            products = productDao.getFilterProduct(name);
        }else{
            int id = (int)session.getAttribute("userId");
            products = productDao.getFilterProductByUser(id,name);
        }
        req.setAttribute("category",name);
        req.setAttribute("products",products);
        RequestDispatcher dispatcher = req.getRequestDispatcher("filterproduct.jsp");
        dispatcher.forward(req,resp);
    }
}
