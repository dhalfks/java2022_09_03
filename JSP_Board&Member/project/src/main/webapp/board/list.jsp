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
<div class="row">
	<div class="col-sm-12 col-md-6">
		<h1>Board List Page
			<a href="/brd/register" class="btn btn-outline-primary">REG</a>
		</h1>	
	</div>
	
	<div class="col-sm-12 col-md-6">
	<form action="/brd/pageList" method="post">
		<div class="input-group mb-3">
		<c:set value="${pgn.pgvo.type }" var="typed"/>
  			<select class="form-select" name="type">
    			<option ${typed == null ? 'selected':'' }>Choose...</option>
    			<option value="t" ${typed eq 't' ? 'selected':'' }>Title</option>
    			<option value="c" ${typed eq 'c' ? 'selected':'' }>Content</option>
    			<option value="w" ${typed eq 'w' ? 'selected':'' }>Writer</option>
  			</select>
  			<input class="form-control" type="text" name="keyword" placeholder="Search" value="${pgn.pgvo.keyword }">
  			<input type="hidden" name="pageNo" value="${pgn.pgvo.pageNo }">
  			<input type="hidden" name="qty" value="${pgn.pgvo.qty }">
  			<button type="submit" class="btn btn-success position-relative">
  			Search
  			<span class="position-absolute top-0 start-100 translate-middle badge rounded-pill bg-danger">
    		${pgn.totalCount }
    		<span class="visually-hidden">unread messages</span></span>
  			</button>
		</div>
	</form>
	</div>
</div>

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