<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mytag" uri="http://com.github.lishunxing/mytag/core" %>
<%--
  Created by IntelliJ IDEA.
  User: guoke
  Date: 2017/3/31
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose</title>
</head>
<body>

<%
    pageContext.setAttribute("age", 25);
    pageContext.setAttribute("date",new Date());
%>
<h3>This is Core Tag Attribute</h3>
<c:choose>
    <c:when test="${pageScope.age>20}">
        Age大于20
    </c:when>
    <c:when test="${pageScope.age>15}">
        Age大于15小于20
    </c:when>
    <c:otherwise>Age小于15</c:otherwise>
</c:choose>
<br>
<h3>This is My Tag Attribute</h3>
<mytag:choose>
    <mytag:when flag="${pageScope.age>25}">
        MyTag Age大于25
    </mytag:when>
    <mytag:when flag="${pageScope.age>20}">
        MyTag Age大于20
    </mytag:when>

    <mytag:other>
        MyTag Age小于15
    </mytag:other>
</mytag:choose>

<h3>This is My DateFormat Function</h3>
${mytag:dateFormat(date, "yyyy-MM-dd HH:mm:ss")}
</body>
</html>
