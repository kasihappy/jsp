<html>
    <head>
        <title>
            登录页面
        </title>
    </head>
<body>
<%
    int flag = 0;
    String errorMessage;

    String loginname = request.getParameter("Name");
    String loginpassword = request.getParameter("Password");

    if (loginname.equals("kasihappy") && loginpassword.equals("123"))
        flag = 1;
    if (flag == 1)
    {
        errorMessage = "成功登录";
        response.sendRedirect("5-OK.jsp");
    } else {
        errorMessage = "错误，请重试!";
        response.sendRedirect("5.jsp?errorinfo="+errorMessage);
    }
%>
</body>
</html>