<%--
  Created by IntelliJ IDEA.
  User: 17143
  Date: 2023/11/30
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="myFirstTag" uri="/URLhello" %>
<html>
<head>
    <title>JSP 自定义标记-cn_hello</title>
</head>
<link rel="stylesheet"
      href="../resources/css/defaultPage.css"
      type="text/css">
<body>
<br>
<p><img src="../resources/images/1.gif"></p>
<h2>JSP 自定义标记-cn_hello</h2>
<p><a href="index.html">返回</a></p>
<hr>
<myFirstTag:hello />
<myFirstTag:cn_hello/>
</body>
</html>