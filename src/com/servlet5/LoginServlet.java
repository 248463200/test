package com.servlet5;

import com.servlet4.HTTPServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = new User(1,"张三");
        request.setAttribute("user",user);
        request.getRequestDispatcher("/system/welcome5").forward(request,response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(2,"李四");
        request.setAttribute("user",user);
        response.sendRedirect(request.getContextPath()+"/success.html");
    }
}
