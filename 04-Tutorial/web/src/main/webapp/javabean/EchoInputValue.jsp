<%--
  Created by IntelliJ IDEA.
  User: 17143
  Date: 2023/11/23
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态显示输入值</title>
</head>
<jsp:useBean id="myBean"
             scope="session"
             class="org.kasihappy.Tutorial.web.javabean.EmployeeBean"/>
<link rel="stylesheet"
      href="../resources/css/defaultPage.css"
      type="text/css">
<body>
    <p><img src="../resources/images/banner.gif" border="0"></p>
    <p><a href="index.html">返回</a></p>
    <hr>
    <br>
    <%
        String name = request.getParameter("name");
        if (name != null) {
            myBean.setName(name);
        }
    %>

<form method="post" action="EchoInputValue.jsp">
    请输入(name):<input type="text" name="name" size="20">
    <input type="submit" name="Submit" value="确定">
</form>
<hr>
<br>
<p>Bean的name是：<font color="red" size="5"><%=myBean.getName()%></font></p>
</body>
</html>
