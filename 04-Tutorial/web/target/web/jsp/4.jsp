<%--
  Created by IntelliJ IDEA.
  User: 17143
  Date: 2023/11/23
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试JSP include指令</title>
    <link rel="stylesheet"
            href="../resources/css/defaultPage.css"
            type="text/css">
    <link rel="stylesheet"
          href="../resources/css/pageLayout.css"
          type="text/css">
</head>
<body>
    <div id="top" class="top">
        <%@include file="4-top.jsp"%>
    </div>
    <div>
        <div id="left" class="left">
            <%@include file="4-left.jsp"%>
        </div>
        <div id="right" class="right">
            <%@include file="4-right.jsp"%>
        </div>
    </div>
</body>
</html>
