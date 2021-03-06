package com.github.lishunxing.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/16.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        req.setAttribute("username",username);
        req.setAttribute("password",password);
        req.getRequestDispatcher("/views/success.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setCharacterEncoding("UTF-8");
        req.setAttribute("username",req.getParameter("username"));
        req.setAttribute("password",req.getParameter("password"));
        req.getRequestDispatcher("/views/success.jsp").forward(req,resp);
    }
}
