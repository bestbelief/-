<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/20
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<s:form action="add" method="POST">
    <s:textfield label="员工id" name="employee.eid"/>
    <s:textfield label="姓名" name="employee.name"/>
    <s:textfield label="年龄" name="employee.age"/>
    <s:textfield label="部门" name="employee.department"/>
    <s:textfield label="入职时间" name="employee.hiredate"/>
    <s:textfield label="家庭地址" name="employee.address"/>
    <s:textfield label="电话" name="employee.phone"/>
    <s:submit value="提交"/>
</s:form>


</body>
</html>
