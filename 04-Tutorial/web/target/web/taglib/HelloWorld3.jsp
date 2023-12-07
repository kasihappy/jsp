<%--
  Created by IntelliJ IDEA.
  User: 17143
  Date: 2023/11/30
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags/hello" %>
<html>
<head>
    <title>JSP 自定义标记 - JSP 2.0 使用 Tag 文件示例</title>
</head>
<link rel="stylesheet"
      href="../resources/css/defaultPage.css"
      type="text/css">
<body>
<br>
<p><img src="../resources/images/1.gif"></p>
<h2>JSP 自定义标记 - JSP 2.0 使用 Tag 文件示例</h2>
<p><a href="index.html">返回</a></p>
<hr>
标记的输出：<tags:helloworld />
</body>
</html>
