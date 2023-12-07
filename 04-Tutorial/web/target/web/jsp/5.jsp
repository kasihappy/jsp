<%--
  Created by IntelliJ IDEA.
  User: 17143
  Date: 2023/11/23
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <%@include file="5-header.jsp"%>
    <% String info = request.getParameter("errorinfo");
        if (info != null) {
            out.println("<p align=center><font color=red>提示："+info+"</font></p>");
        }
    %>
<form action="5-check_info.jsp">
    <table align="center">
        <tr>
            <td>
                用户名 <input type="text" size="30" name="Name">
            </td>
        </tr>
        <tr>
            <td>
                口令 <input type="password" size="30" name="Password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
                <input type="reset" value="清除">
            </td>
        </tr>
    </table>
</form>
<%@include file="5-footer.jsp"%>
</body>
</html>
