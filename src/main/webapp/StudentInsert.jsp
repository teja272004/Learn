<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hi man

<form action = "StudentServlet" method="post">
<table>
<tr>
<td>ID</td>
<td><input type="text" id="id" name="id"></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" id="name" name="name"></td>
</tr>
<tr>
<td>Phone Number</td>
<td><input type="text" id="pno" name="pno"></td>
</tr>

</table>
<button type="submit" value="Submit">Submit</button>
</form>
<a href="fetch.html"><button>Fetch</button></a>
<form action = "StudentDel" method="post">
<p>Enter your id</p>
<input type="text" id="id" name="id">
</form>
<h1>Update Students</h1>

<form action = "UpdateStu" method="post">
<table>
<tr>
<td>ID</td>
<td><input type="text"  name="id"></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text"  name="name"></td>
</tr>
<tr>
<td>Phone Number</td>
<td><input type="text"  name="pno"></td>
</tr>

</table>
<button type="submit" value="Submit">Submit</button>
</form>
</body>
</html>