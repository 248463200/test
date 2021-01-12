package com.servlet3;

import com.servlet2.GenericServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends GenericServlet {

    @Override
    public void init() {
        System.out.println("WelcomeServlet  execute init");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String method =  httpRequest.getMethod();
        httpResponse.setContentType("text/html;charset=UTF-8");
        if("GET".equals(method)){
            throw new RuntimeException("405 请求方式异常");
        }
        httpResponse.getWriter().print("登录成功"+method);

    }
}
