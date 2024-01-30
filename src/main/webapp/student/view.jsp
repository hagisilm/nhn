<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="cfmt" uri="http://nhnacademy.com/cfmt" %>

<html>
<head>
    <title>학생-조회</title>
    <link rel="stylesheet" href="/style.css" />
    <meta charset="UTF-8" />
    <style>
        table {
            width: 800px;
            border-collapse: collapse;
            border: 1px #ccc solid;
        }

        table tr > td, th {
            padding: 5px;
            border: 1px #ccc solid;
        }
    </style>
</head>
<body>
<table>
    <tbody>
    <!-- todo view 구현 -->
    <tr>
        <th style="text-align: center">아이디</th>
        <td>${student.id}</td>
    </tr>
    <tr>
        <th style="text-align: center">이름</th>
        <td>${student.name}</td>
    </tr>
    <tr>
        <th style="text-align: center">성별</th>
        <td>${student.gender}</td>
    </tr>
    <tr>
        <th style="text-align: center">나이</th>
        <td>${student.age}</td>
    </tr>
    <tr>
        <th>등록일</th>
        <td style="text-align: center">
            ${cfmt:formatDate(student.createdAt, 'yyyy-MM-dd HH:mm:ss')}
        </td>
    </tr>

    </tbody>



</table>
<ul>
    <li><a href="/student/list.do">리스트</a></li>
    <li>
        <!-- todo ${update_link} 설정 c:url -->
        <c:url var="update_link" value="/student/update.do">
            <c:param name="id" value="${student.id}"/>
        </c:url>
        <a href="${update_link}">수정</a>
    </li>
    <li>
        <!-- todo 삭제버튼 구현, method=post -->
        <form action="/student/delete.do" method="post">
            <input type="hidden" name="id" value="${student.id}" />
            <input type="submit" value="삭제" />
        </form>

     </li>

 </ul>

</body>
</html>