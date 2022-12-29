<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List page</title>
<style type="text/css">
a{
text-decoration: none;
}
</style>
</head>
<body>
<h1>Board List Page</h1>
<table border="1">
	<tr>
		<th>BNO</th>
		<th>TITLE</th>
		<th>writer</th>
		<th>reg_date</th>
		<th>read_count</th>
	</tr>
	<c:forEach items="${list }" var="bvo">
		<tr>
			<td>${bvo.bno }</td>
			<td><a href="/brd/detail?bno=${bvo.bno }">${bvo.title }</a></td>
			<td>${bvo.writer }</td>
			<td>${bvo.reg_date }</td>
			<td>${bvo.read_count }</td>
		</tr>
	</c:forEach>

</table>
<div>
	<c:if test="${pgh.prev }">
	<a href="/brd/page?pageNo=${pgh.startPage-1 }&qty=${pgh.pgvo.qty }">prev</a>
	</c:if>
	<c:forEach begin="${pgh.startPage }" end="${pgh.endPage }" var="i">
		<a href="/brd/page?pageNo=${i }&qty=${pgh.pgvo.qty}">${i } ｜</a>
	</c:forEach>
	<c:if test="${pgh.next }">
	<a href="/brd/page?pageNo=${pgh.endPage+1 }&qty=${pgh.pgvo.qty }">next</a>
	</c:if>
</div>
<a href="/index.jsp">index로...</a>
</body>
</html>