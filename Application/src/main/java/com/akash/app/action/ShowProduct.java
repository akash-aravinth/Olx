package com.akash.app.action;

import com.akash.app.dao.ProductDao;
import com.akash.app.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/showproduct")
public class ShowProduct extends HttpServlet {
    private ProductDao productDao;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productDao = new ProductDao();
      String productid = req.getParameter("product");
      Product product = productDao.getOneProduct(productid);
      HttpSession session = req.getSession();
        System.out.println(session.getAttribute("userId"));
        req.setAttribute("product", product);
        req.getRequestDispatcher("/product.jsp").forward(req, resp);
    }
}
