<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope2</title>
</head>
<body>
<p>request info:  <%=request.getAttribute("info")%></p>
<p>pageContext info:  <%=pageContext.getAttribute("info")%></p>
<p>session info:  <%=session.getAttribute("info")%></p>
<p>application info:  <%=application.getAttribute("info")%></p>
</body>
</html>
