package com.servlet5;

import com.servlet4.HTTPServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user =(User) request.getAttribute("user");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(user);
    }
}
