公司要快速开发一个非常简单的小项目，不让用框架，好久没用Servlet,周六日先熟悉一下Servlet规范

package servlet2：
    每个Servlet对象都要实现一个Servlet接口，代码显得很多，发现JAVAEE提供了一个适配器类，Servlet对象继承这个适配器就OK了。
    这里先简单实现一个demo，真正使用调用javax.servlet.GenericServlet这个类
    注：本来以为会公用一个ServletConfig，试了一下并不是


package servlet3:
    保证前后端请求方式一致（不封装）

package servlet4:
    区分GET/POST请求，同样JAVAEE也提供了代码
    这里还是实现一个demo,真正使用javax.servlet.http.HttpServlet

package servlet5:
    转发和重定向
    转发：request.getRequestDispatcher("/system/welcome5").forward(request,response);
    重定向：response.sendRedirect(request.getContextPath()+"/success.html");
    区别：转发是一次请求，重定向是两次
         重定向需要加根目录
         重定向可以跨APP跳转


package template:
    发现HttpServlet是一种典型模板设计模式，实现一下这种编程思想
    主要作用：1、核心算法得到保护
             2、核心算法得到复用
             3、可快速定义算法步骤

乱码问题：
    1.显示乱码，页面加<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
      或者代码response.setContentType("text/html;charset=UTF-8");
    2.页面传递后台乱码:
       get:
       在tomcat的server.xml设置编码

       post:
       request.setCharacherEncoding("UTF-8");

       get/post通用:
       转成字节解码再组装
       String keyword = request.gerParameter("key");
       byte[] bytes = keyword.getBytes("ISO-8859-1");
       keyword = new String(bytes,"UTF-8")

