<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookie</title>
</head>
<body>

<%
    String value = request.getParameter("name");
    if (null != value) {
        Cookie cookie = new Cookie("fruit_"+value, value);
        //设置cookie过期时间，单位秒
        cookie.setMaxAge(10);
        //Cookie默认作用范围在当前目录以及子目录，对于上级目录一默认是不作用的。可以通过setPath来设定作用范围，/为站点目录，也可以设置request.getContextPath
        cookie.setPath(request.getContextPath());
        //因为cookie可以有多个，所以这里是add而不是set。
        response.addCookie(cookie);
        response.sendRedirect("cookierequest.jsp");
    }

    /*Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++) {
        out.print("<br>");
        out.print(cookies[i].getName()+":"+cookies[i].getValue());
    }*/
%>

</body>
</html>
