<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/8
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>欢迎登陆</h1>
<form action="user?method=login" method="post">
    用户名：<input type="text" name="username" placeholder="用户名"><br>
    密码:<input type="password" name="password" placeholder="密码"><br>
    邮箱:<input type="text" name="email" placeholder="邮箱"><br>
    <input type="submit" value="登陆">



</form>


</body>
</html>
