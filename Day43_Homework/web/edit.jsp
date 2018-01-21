<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/20
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑</title>
</head>
<body>

<s:form action="edit" method="POST">
    <s:textfield value="%{#employee.eid}" name="employee.eid" label="员工id"/>
    <s:textfield value="%{#employee.name}" name="employee.name" label="姓名"/>
    <s:textfield value="%{#employee.age}" name="employee.age" label="年龄"/>
    <s:textfield value="%{#employee.department}" name="employee.department" label="部门"/>
    <s:textfield value="%{#employee.hiredate}" name="employee.hiredate" label="入职时间"/>
    <s:textfield value="%{#employee.address}" name="employee.address" label="地址"/>
    <s:textfield value="%{#employee.phone}" name="employee.phone" label="电话"/>
    <s:submit value="提交"/>
</s:form>





    <%--<s:textfield value=""--%>
    <%--<li><s:property value="%{#employee.eid}"/></li>--%>
    <%--<li><s:property value="%{#employee.name}"/></li>--%>
    <%--<li><s:property value="%{#employee.age}"/></li>--%>
    <%--<li><s:property value="%{#employee.department}"/></li>--%>
    <%--<li><s:property value="%{#employee.address}"/></li>--%>
    <%--<li><s:property value="%{#employee.phone}"/></li>--%>
<%--</ul>--%>
<%--<form action="edit.action" method="post">--%>








<%--</form>--%>



</body>
</html>
