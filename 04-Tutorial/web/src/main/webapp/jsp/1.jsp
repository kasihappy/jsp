<%--
  Created by IntelliJ IDEA.
  User: 17143
  Date: 2023/11/16
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>测试JSP注释</title>
</head>
<body>
<h1><p>显式注释</p>
<!--这是一个例子-->
    <p>表达式注释</p>
<!--当前时间为:<%=(new java.util.Date().toLocaleString())%>-->
    <p>隐藏注释</p>
<%--这是隐藏注释--%>
</h1>
</body>
</html>
