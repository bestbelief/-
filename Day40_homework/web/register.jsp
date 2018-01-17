<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/15
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>欢迎注册</h1>
<form action="register" method="post">
    <table>
        <tr>

            用户名： <input type="text" name="username" placeholder="用户名">
            <s:fielderror fieldName="username"/><br>
        </tr>
          <tr> 密码：      <input type="password" name="password" placeholder="密码">
              <s:fielderror fieldName="password"/> <br>
          </tr>

        <tr>  确认密码：  <input type="password" name="confirmPassword" placeholder="确认密码">
            <s:fielderror fieldName="confirmPassword"/> <br>
        </tr>

         <tr> 手机号：    <input type="text" name="phone" placeholder="手机号">
             <s:fielderror fieldName="phone"/> <br>
         </tr>

           <tr>  邮箱：      <input type="text" name="email" placeholder="邮箱">
               <s:fielderror fieldName="email"/> <br>
           </tr>

          <tr>   验证码：    <input type="text" name="verify" placeholder="验证码">
              <s:fielderror fieldName="verify"/> <br>
          </tr>

           <tr>
               <input type="submit" value="提交">
           </tr>

    </table>

</form>
</body>
</html>
