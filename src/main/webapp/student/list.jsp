<%--
  Created by IntelliJ IDEA.
  User: kimbyeongju
  Date: 2024/01/27
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>학생 관리</title>
    <style>
        table {
            width: 800px;
            border-collapse: collapse;
            border:1px #ccc solid;
        }
        table tr>td,th{
            padding:5px;
            border:1px #ccc solid;
        }
    </style>
    <meta charset="UTF-8" />
</head>
<body>
<h1>학생 리스트</h1>
<a href="/student/register.do">학생(등록)</a>
<br>
<table>
    <thead>
    <tr>
        <th style="width: 30%" >아이디</th>
        <th style="width: 20%" >이름</th>
        <th style="width: 25%">성별</th>
        <th style="width: 25%">나이</th>
        <th style="width: 25%">cmd</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.id}</td>
            <td style="text-align: center">${student.name}</td>
            <td style="text-align: center">${student.gender}</td>
            <td style="text-align: center">${student.age}</td>
            <td style="text-align: center" >
                <c:url var="view_link" value="/student/view.do">
                    <c:param name="id" value="${student.id}"></c:param>
                </c:url>
                    <a href="${view_link}">조회</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
