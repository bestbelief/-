<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/15
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>欢迎登录</h1>
<form action="login" method="post">
    用户名： <input type="text" name="username" placeholder="用户名"><br>
    密码：    <input type="password" name="password" placeholder="密码"><br>
    手机号：    <input type="text" name="phone" placeholder="手机号"><br>
    邮箱：      <input type="text" name="email" placeholder="邮箱"><br>
    验证码：    <input type="text" name="verify" placeholder="验证码"><br>
     <input type="submit" value="提交">


</form>

</body>
</html>
