<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request cookie</title>
</head>
<body>

<a href="cookie.jsp?name=apple">Apple</a>
<a href="cookie.jsp?name=orange">Orange</a>
<a href="cookie.jsp?name=banana">Banana</a>

<%
    Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++) {
        if(cookies[i].getName().startsWith("fruit_")) {
            out.println(cookies[i].getValue());
            out.print("<br>");
        }
    }
%>
</body>
</html>
