<%--
  Created by IntelliJ IDEA.
  User: guoke
  Date: 2017/3/12
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form name="form" action="/login" method="get">
        username:<input name="username" value="" type="text">
        password<input name="password" value="" type="password">
        interest:<input type="checkbox" value="book" name="interest">book
        <input type="checkbox" value="game" name="interest">game
        <button type="submit" value="提交" name="submit" />提交
    </form>
</div>

</body>
</html>
