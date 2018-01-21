<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lanou3g
  Date: 2018/1/19
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>所有的员工信息</title>
  </head>
  <body>
  <h1>所有的员工信息</h1>
    <s:if test="#employees != null">

        <table border="1">
          <tr>
            <th>员工id</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>部门</th>
            <th>入职时间</th>
            <th>家庭地址</th>
            <th>电话</th>
            <th>其它</th>
          </tr>
          <s:iterator var="employee" value="#employees">
            <tr>
              <td><s:property value="%{#employee.eid}"/> </td>
              <td><s:property value="%{#employee.name}"/> </td>
              <td><s:property value="%{#employee.age}"/> </td>
              <td><s:property value="%{#employee.department}"/> </td>
              <td><s:property value="%{#employee.hiredate}"/> </td>
              <td><s:property value="%{#employee.address}"/> </td>
              <td><s:property value="%{#employee.phone}"/> </td>
              <td>
               <s:a href="queryone.action?employee.eid=%{#employee.eid}">编辑</s:a>
              </td>

            </tr>
          </s:iterator>
        </table>

    </s:if>
  </body>
</html>
