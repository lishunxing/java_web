<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
<di>
    <h3>表单提交的参数：</h3>
    <h4>username : <%=request.getAttribute("username")%></h4>
    <h4>password : <%=request.getAttribute("password")%></h4>
</di>
</body>
</html>
