<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
   <link rel="stylesheet" href="/resources/style.css">
<title>List page</title>

</head>
<body>
<br>
<div class="container">
<h1>Board List Page</h1><br>
<table class="table table-hover">
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
			<td>
			<c:if test="${bvo.image_file ne '' && bvo.image_file ne null }">
				<img class="decoration-lines" alt="없음" src="/_fileUpload/th_${bvo.image_file }">
			</c:if>
			<a href="/brd/detail?bno=${bvo.bno }">${bvo.title }</a>
			</td>
			<td>${bvo.writer }</td>
			<td>${bvo.reg_date }</td>
			<td>${bvo.read_count }</td>
		</tr>
	</c:forEach>

</table>
<div>
검색 <input type="text" >
</div>

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
</div>
</body>
</html>