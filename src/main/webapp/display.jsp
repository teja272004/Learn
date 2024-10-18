<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List of Students</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone Number</th>
        </tr>
        <c:forEach var="student" items="${student}">
    <tr>
        <td>${student[0]}</td>
        <td>${student[1]}</td>
        <td>${student[2]}</td>
    </tr>
    
</c:forEach>

    </table>
</body>
</html>