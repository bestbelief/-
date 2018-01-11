<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/9
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>msg</title>
</head>
<body>
<c:forEach var="type" begin="0" items="${requestScope.all}" end="${requestScope.all.size()}" >
    < value="${type}"/>
</c:forEach>




</form>



</body>
</html>
