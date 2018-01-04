<%@ page import="bean.User" %><%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/2
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
  </head>
  <body>
  <%
  if(session.getAttribute("username") !=null){
  User user =(User)session.getAttribute("user");
  session.setAttribute("username",user.getUsername());
  %>
  <h1>欢迎你来到主页</h1>
  <%
  }else {
  %>
  <span>登陆失败，请先登录或者注册</span><br>
  <a href="http://localhost:8080/login.html">点击登录</a>
  <a href="http://localhost:8080/register.html">点击注册</a>
  <%

  }
  %>


  </body>
</html>
