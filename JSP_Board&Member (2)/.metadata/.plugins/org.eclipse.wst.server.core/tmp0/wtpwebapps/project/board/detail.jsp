<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Board Detail Page</h1>
<table border="1">
	<tr>
		<th>BNO</th>
		<td>${bvo.bno }</td>
	</tr>
	<tr>
		<th>Title</th>
		<td>${bvo.title }</td>
	</tr>
	<tr>
		<th>read_count</th>
		<td>${bvo.read_count }</td>
	</tr>
	<tr>
		<th>writer</th>
		<td>${bvo.writer }</td>
	</tr>
	<tr>
		<th>reg_date</th>
		<td>${bvo.reg_date }</td>
	</tr>
	<tr>
		<th>Content</th>
		<td>${bvo.content }</td>
	</tr>
</table>
<div>
	comment line<br>
	<input type="text"  id="cmtWriter" value="${ses.email }" readonly="readonly"><br>
	<input type="text"  id="cmtText" placeholder="Add Comment">
	<button type="button" id="cmtAddBtn">댓글등록</button>		
		
</div>
<c:if test="${ses.email eq bvo.writer }">
<a href="/brd/modify?bno=${bvo.bno }">수정</a><br>
<a href="/brd/remove?bno=${bvo.bno }">삭제</a><br>
</c:if>
<a href="/brd/pageList">리스트</a><br>

<script type="text/javascript">
const bnoVal = '<c:out value="${bvo.bno}"/>';
</script>

<script src="/resources/board_detail.js"></script>
</body>
</html>