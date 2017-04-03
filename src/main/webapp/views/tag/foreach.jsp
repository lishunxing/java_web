<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="myTag" uri="http://com.github.lishunxing/mytag/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guoke
  Date: 2017/3/30
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ForEach Tag</title>
</head>
<body>

<%
    List<String> list=new ArrayList<String>(Arrays.asList("lishunxing","guoke","final丶Glory","蕞後的辉煌"));
    pageContext.setAttribute("list",list);
%>

<myTag:forEach items="${list}" var="item">
    <h3>我叫${item}</h3>
</myTag:forEach>
</body>
</html>
