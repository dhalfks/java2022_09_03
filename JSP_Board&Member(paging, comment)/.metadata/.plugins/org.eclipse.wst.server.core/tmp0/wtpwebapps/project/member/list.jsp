<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Member List Page</h1>
<table border="1">
	<tr>
		<th>Email</th>
		<th>PASSWORD</th>
		<th>Nick_Name</th>
		<th>reg_at</th>
		<th>Last_login</th>
	</tr>
	<c:forEach items="${list }" var="mvo">
	<tr> 
		<th>${mvo.email }</th>
		<th>${mvo.pwd }</th>
		<th>${mvo.nick_name }</th>
		<th>${mvo.reg_at }</th>
		<th>${mvo.last_login }</th>
	</tr>
	
	</c:forEach>
</table>
<a href="/">index..</a>
</body>
</html>