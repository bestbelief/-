<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/20
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>欢迎登录</h1>
<form action="login.action" method="post">
    用户名：<input type="text" name="user.username" placeholder="用户名"><br>
    密码：<input type="password" name="user.password" placeholder="密码"><br>
    <input type="submit" value="登录">
</form>

<%--<s:form action="login" method="POST">--%>
    <%--<s:textfield name="user.username"/>--%>
    <%--<s:textfield name="user.password"/>--%>
    <%--<s:submit/>--%>
<%--</s:form>--%>


</body>
</html>
