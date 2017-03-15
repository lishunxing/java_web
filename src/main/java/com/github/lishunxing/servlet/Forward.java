package com.github.lishunxing.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*req.setAttribute("info","this is forward info");
        req.getRequestDispatcher("/views/scope2.jsp").forward(req,resp);*/
        req.getRequestDispatcher("http://www.baidu.com").forward(req,resp);
    }
}
