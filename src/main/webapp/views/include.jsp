<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>include</title>
</head>
<body>
<h2>This is Include Parent Page</h2>
<p>=================================</p>
<%String str="123";%>
 这是静态引入页面,可以使用str
<%@ include file="include/a.jsp"%>

<%--<jsp:include page="include/a.jsp"/>--%>

<jsp:forward page="include/b.jsp">
    <jsp:param name="aaa" value="我是李顺兴"/>
</jsp:forward>
</body>
</html>
