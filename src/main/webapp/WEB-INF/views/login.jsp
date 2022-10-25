<%--
  Created by IntelliJ IDEA.
  User: hrkim
  Date: 2022-10-25
  Time: 오후 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
메시지 : ${msg}
<form action="login" method="post">
    username : <input type="text" name="username" required ><br/>
    password : <input type="password" name="password" required><br/>
    <button type="submit">제출</button>
</form>
</body>
</html>
