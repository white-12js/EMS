<%--
  Created by IntelliJ IDEA.
  User: YOUZI
  Date: 2020/7/3
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Springboot项目测试jsp页面</title>
</head>
<body>
    <h1>登录</h1>
    <form method="post"action="/user/login">
        用户名：
        <input type="text" name="userName"><br>
        密    码：
        <input type="password" name="userPassword"><br>
        <button type="submit" name="login">登录</button>
    </form>
</body>
</html>
