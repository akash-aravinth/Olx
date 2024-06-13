package com.akash.app.action;

import com.akash.app.dao.OrderDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/purchase")
public class Purchase extends HttpServlet {

    private OrderDao orderDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        orderDao = new OrderDao();
        HttpSession session = req.getSession();
        if (session.getAttribute("userId") == null) {
            PrintWriter pw = resp.getWriter();
            pw.println("Please Login And Order Something");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);
        }
        String productid = req.getParameter("id");
        int userId = (int) session.getAttribute("userId");
        orderDao.addOrder(userId, Integer.parseInt(productid));
        RequestDispatcher dispatcher = req.getRequestDispatcher("purchasesuccess.jsp");
        dispatcher.forward(req, resp);
    }
}

