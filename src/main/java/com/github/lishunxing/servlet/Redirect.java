package com.github.lishunxing.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*req.setAttribute("info","this is redirect info");
        resp.sendRedirect("/views/scope2.jsp");*/
        resp.sendRedirect("http://www.baidu.com");
    }
}
