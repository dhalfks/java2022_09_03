<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>Member List Page</h1><br>
<table class="table table-hover">
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
</table><br>
<a href="/">index..</a>
</div>
</body>
</html>