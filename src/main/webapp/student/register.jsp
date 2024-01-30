<%--
  Created by IntelliJ IDEA.
  User: kimbyeongju
  Date: 2024/01/27
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>학생 등록</title>
    <link rel="stylesheet" href="/style.css">
    <meta charset="UTF-8" />
</head>
<body>
<h1>학생-등록</h1>
<hr>
<form action="/student/register.do" method="post" accept-charset="UTF-8">
<table>
    <tr>
        <td style="text-align: center">아이디</td>
        <td><input type="text" name="id"></td>
    </tr>
    <tr>
        <td style="text-align: center">이름</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td style="text-align: center">성별</td>
        <td><input name="gender" type="radio" value="M">남<input name="gender" type="radio" value="F">여</td>
    </tr>
    <tr>
        <td style="text-align: center">나이</td>
        <td><input type="text" name="age"></td>
    </tr>
</table>
<input type="submit" value="등록">
</form>

</body>
</html>
