<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/8
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>regist</title>
</head>
<body>
<h1>欢迎注册</h1>
<form action="user?method=regist" method="post">
    用户名： <input type="text" placeholder="用户名" name="username" >
    <br>
    密码：<input type="password" placeholder="密码" name="password">
    <br>
    邮箱：<input type="text" placeholder="邮箱" name="email">
    <br>
    <input type="submit" value="提交">
</form>




</body>
</html>
