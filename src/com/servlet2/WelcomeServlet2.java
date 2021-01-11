package com.servlet2;

import javax.servlet.*;
import java.io.IOException;

public class WelcomeServlet2 extends GenericServlet {

    @Override
    public void init() {
        System.out.println("WelcomeServlet2  execute init");
    }

    @Override
    public void service(ServletRequest request, ServletResponse rResponse) throws ServletException, IOException {
        ServletConfig config =  getServletConfig();
        ServletContext application = config.getServletContext();
        System.out.println(config);
    }
}
