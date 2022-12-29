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
<h1>Member Modify Page</h1>
<form action="/mem/update" method="post">
E-Mail : <input type="text" name="email" value="${ses.email }" readonly><br>
Password : <input type="text" name="pwd" value="${ses.pwd }"><br>
Nick_Name : <input type="text" name="nick_name" value="${ses.nick_name }"><br>
<input type="hidden" name="reg_at" value="${ses.reg_at }"><br>
<input type="hidden" name="last_loagin" value="${ses.last_login }"><br>
<button type="submit">modify</button>
</form>
</body>
</html>