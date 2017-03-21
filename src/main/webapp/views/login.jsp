<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h3>POST Request</h3>
    <form name="form" action="/loginServlet" method="post">
        username:<input name="username" value="" type="text">
        password<input name="password" value="" type="password">
        interest:<input type="checkbox" value="book" name="interest">book
        <input type="checkbox" value="game" name="interest">game
        <button type="submit" value="提交" name="submit" />提交
    </form>
</div>

<div>
    <h3>GET Request</h3>
    <form name="form" action="/loginServlet" method="get">
        username:<input name="username" value="" type="text">
        password<input name="password" value="" type="password">
        interest:<input type="checkbox" value="book" name="interest">book
        <input type="checkbox" value="game" name="interest">game
        <button type="submit" value="提交" name="submit" />提交
    </form>
</div>

    <%
        //这些都是我没有声明就可以使用的对象，叫做隐含对象
        //request
        String method=request.getMethod();
        //response
        String contentType = response.getContentType();
        //out
        out.println(method+","+contentType);
        //pageContext
        out.println(request==pageContext.getRequest());
        //session
        out.println(session.getId());
        //application
        out.println(application.getInitParameter("driver"));
        //config
        out.println(config.getInitParameter("username"));
        out.println(config.getServletName());
        //page
        out.println(page.getClass().toString());

    %>

</body>
</html>
