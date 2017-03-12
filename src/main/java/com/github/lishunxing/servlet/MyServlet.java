package com.github.lishunxing.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by guoke on 2017/3/12.
 */
public class MyServlet implements Servlet {

    public MyServlet(){
        System.out.println("this is MyServlet constructor");
    }

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("this is init method");
        //initParam参数
        System.out.println("init param username -->"+servletConfig.getInitParameter("username"));
        //initParam参数集合
        Enumeration<String> enumeration=servletConfig.getInitParameterNames();
        while (enumeration.hasMoreElements()) System.out.println(enumeration.nextElement());
        //获取servlet名字
        System.out.println(servletConfig.getServletName());


        //获取servletContext
        ServletContext servletContext = servletConfig.getServletContext();
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) System.out.println(servletContext.getInitParameter(initParameterNames.nextElement()));
        //获取当前web应用的path
        System.out.println("当前web应用的路径-->"+servletContext.getContextPath());
        //获取web文件夹下文件的真实路径
        System.out.println("index.jsp的真实路径-->"+servletContext.getRealPath("/index.jsp"));
        //获取文件的输入流,通过类加载器加载的是resources下的文件。而通过servletContext.getResourceAsStream()加载的为web目录下的文件
        System.out.println(servletContext.getResourceAsStream("log4j.properties"));
        System.out.println(getClass().getClassLoader().getResourceAsStream("log4j.properties"));

    }

    public ServletConfig getServletConfig() {
        System.out.println("this is getServletConfig method");
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is MyServlet service method");

    }

    public String getServletInfo() {
        System.out.println("this is getServletInfo method");
        return null;
    }

    public void destroy() {
        System.out.println("this is destroy method");
    }
}
