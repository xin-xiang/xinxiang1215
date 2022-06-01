<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week2homework</title>
</head>
<body>
<a href="https://www.yjwujian.cn/">go to yjwj</a>
<form method="post" action="/xx/register"><!--within dopost() in servlet-->
    username:<input name="username" type="text" ><br/>
    password:<input name="password" type="password" ><br/>
    Email:<input name="email" type="text" ><br/>
    Gender:<input type="radio" name="gender" value="male">Male<input type="radio" name="gender" value="female">Female<br/>
    Date of Birth:<input type="text name=" name="birthDate"><br/>
    <input type="submit" value="Register"/>
</form>
</body>
</html>
