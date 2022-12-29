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
<h1>My First Project Board & Member!!</h1>
<c:if test="${ses.email ne null && ses.email ne '' }">
 ${ses.email } login 하였습니다. <br>
 계정생성일 : ${ses.reg_at }<br>
 마지막 접속 : ${ses.last_login } <br>
 <a href="/mem/modify"><button type="button">회원정보수정</button></a>
 <a href="/mem/logout"><button type="button">로그아웃</button></a> <br>
 
 </c:if>
 

<c:if test="${ses.email ne null && ses.email ne '' }">
 <a href="/brd/register">Board Register</a>
</c:if>

<a href="/brd/pageList">Board List</a>
<a href="/mem/login">Log in</a>
<a href="/mem/join">Sign Up</a>
<a href="/mem/list">Member List</a><br>

<c:if test="${ses.email ne null && ses.email ne '' }">
 <a href="/mem/remove">회원탈퇴</a>
</c:if>

</body>
</html>