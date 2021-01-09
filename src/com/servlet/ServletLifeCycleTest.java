package com.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletLifeCycleTest implements Servlet {


    public ServletLifeCycleTest(){
        System.out.println("ServletLifeCycleTest  execute");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletLifeCycleTest  init execute ");
    }



    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletLifeCycleTest service execute");
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
        return null;
    }
}
