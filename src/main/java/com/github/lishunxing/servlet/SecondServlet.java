package com.github.lishunxing.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by guoke on 2017/3/12.
 */
public class SecondServlet implements Servlet {

    public SecondServlet(){
        System.out.println("this is secondServlet constructor method");
    }

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("this is secondServlet init method");
    }


    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is secondServlet service method");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("this is secondServlet destroy method");
    }
}
