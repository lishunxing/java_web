package com.github.lishunxing.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by guoke on 2017/3/12.
 */
public class MyHttpServlet extends HttpServlet {
    public MyHttpServlet() {
        super();
        System.out.println("this is httpServlet constructor method");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is httpServlet doGet method");
        //获取单个参数
        System.out.println("username-->"+req.getParameter("username")+",password-->"+req.getParameter("password")+",interest-->"+req.getParameter("interest"));
        //获取多个参数
        System.out.println("数组获取多个参数");
        String[] interests = req.getParameterValues("interest");
        for (String interest : interests) {
            System.out.println(interest);
        }
        //获取Enumeration
        Enumeration parameterNames = req.getParameterNames();
        System.out.println("获取Enumeration");
        while (parameterNames.hasMoreElements()){
            Object o=parameterNames.nextElement();
            System.out.println("name->"+o.toString()+"value"+req.getParameter(o.toString()));
        }
        //获取Map
        System.out.println("获取键值对Map,key为name,value为String[]");
        Map<String,String[]> parameterMap = req.getParameterMap();
        parameterMap.keySet().forEach(item-> {
            System.out.println("key->"+item+",value->");
            for (String s : parameterMap.get(item)) System.out.println(s);
        });



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
        System.out.println("this is httpServlet doPost method");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("this is httpServlet init method");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("this is httpServlet destroy method");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("this is httpServlet service method");
    }
}
