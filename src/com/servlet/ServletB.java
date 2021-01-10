package com.servlet;

import com.entity.Company;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ServletB implements Servlet {


    private ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }



    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        //获取ServletContext
        ServletContext application = config.getServletContext();

        //从ServletContext获取
        Company company = (Company) application.getAttribute("company");

        response.getWriter().print(company);
    }



    @Override
    public void destroy() {

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
