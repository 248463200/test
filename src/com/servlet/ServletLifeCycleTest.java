package com.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ServletLifeCycleTest implements Servlet {


    private ServletConfig config;
    public ServletLifeCycleTest(){
        System.out.println("ServletLifeCycleTest  execute");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("ServletLifeCycleTest  init execute ");
        this.config = config;
    }



    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("ServletLifeCycleTest service execute");
        //获取 ServletConfig
        ServletConfig config = getServletConfig();
        //获取ServletContext
        ServletContext application = config.getServletContext();
        //获取所有上下文初始化参数的name
        Enumeration<String> names = application.getInitParameterNames();
        while (names.hasMoreElements()){
            String name = names.nextElement();
            //通过上下文初始化参数的name获取value
            String value = application.getInitParameter(name);
            System.out.println(name+"  =  "+value);
        }
        //获取文件真实路径
        String realPath = application.getRealPath("/index.html");
        System.out.println("path = "+realPath);
    }



    @Override
    public void destroy() {
        System.out.println("ServletLifeCycleTest destory execute");
    }


    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }
}
