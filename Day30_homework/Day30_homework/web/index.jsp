<%@ page import="domain.User" %><%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/3
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
      <script src="js/jquery-3.2.1.min.js"></script>
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
      <h1>请先登录</h1>
    <a href="http://localhost:8080/login.html">点击登录</a>
  <%
 }
 %>

  <table>
      <tr>
          <td>书名</td>
          <td>作者</td>
          <td>价钱</td>
          <td>封面</td>
      </tr><br>
      <%

      %>

  </table>
<button id="btn" >退出
<a href="login.html"></a>

</button>

  </body>
  <script type="text/javascript">
      $.getJSON("http://localhost:8080/day30/show",
          function (json, status) {
          if (status =="success"){
              $.each(json,function (index,value) {
                  $('table').append($('<tr>')).
                  append($('<td>').text(value['bname'])).
                  append($('<td>').text(value['bname']).
                  append($('<td>').text(value['bname'])))




              })

          }
      })


  </script>
</html>
