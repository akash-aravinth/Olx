package com.akash.app.action;

import com.akash.app.dao.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private UserDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userDao = new UserDao();
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        int id = userDao.isValidUser(email,password);
        if (id > 0){
            System.out.println("true");
            HttpSession session = req.getSession();
            session.setAttribute("userId",id);
            session.setAttribute("permission",true);
            RequestDispatcher rp = req.getRequestDispatcher("index.jsp");
            rp.forward(req,resp);
        }else {
            System.out.println("false");
            RequestDispatcher rp = req.getRequestDispatcher("login.jsp");
            System.out.println("Invalid UserName and Password");
            rp.include(req,resp);
        }
    }
}
