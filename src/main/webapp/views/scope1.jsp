<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope1</title>
</head>
<body>
<c:catch />

<%
    pageContext.setAttribute("info","this is pageContext info");
    request.setAttribute("info","this is request info");
    session.setAttribute("info","this is session info");
    application.setAttribute("info","this is application info");
%>

<p>pageContext info:  <%=pageContext.getAttribute("info")%></p>
<p>request info:  <%=request.getAttribute("info")%></p>
<p>session info:  <%=session.getAttribute("info")%></p>
<p>application info:  <%=application.getAttribute("info")%></p>

<a href="/views/scope2.jsp">scope2.jsp</a>
<c:out value="111"/>

</body>
</html>
