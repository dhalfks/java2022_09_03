<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
    <%
    Connection conn = null;
  	PreparedStatement pst = null;
  	ResultSet rs = null;
  	
  	request.setCharacterEncoding("utf-8");
  	int custno = Integer.parseInt(request.getParameter("custno"));
  	
  	String sql = "select * from member_tbl_02 where custno=?";
  	try{
  		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","ezen");
		pst = conn.prepareStatement(sql);
		pst.setInt(1, custno);  // ?에 custno 값 set 
		rs = pst.executeQuery(); //select => executeQuery()
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑목 회원관리 프로그램</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
<header>
<!-- 헤더 구역 -->
<h1>쇼핑몰 회원관리 ver 1.0</h1>

</header>
<nav>
<!-- 메뉴 구역 -->
<ul>
	<li><a href="register.jsp">회원등록</a></li>
	<li><a href="list.jsp">회원목록조회/수정</a></li>
	<li><a href="moneyList.jsp">회원매출조회</a></li>
	<li><a href="/">홈으로...</a></li>
</ul>
</nav>
<section>
<!-- 본문구역 -->
<h2>홈쇼핑 회원 정보 수정</h2>
<form action="updateProcess.jsp" method="post">
<table>
	<% if(rs.next()) { %>
	<tr>
		<th>회원번호</th>
		<td> <input type="text" name="custno" value="<%=rs.getInt(1) %>" readonly="readonly"> </td>
	</tr>
	<tr>
		<th>회원성명</th>
		<td><input type="text" name="custname" value="<%=rs.getString(2) %>"> </td>
	</tr>
	<tr>
		<th>회원전화</th>
		<td><input type="text" name="phone" value="<%=rs.getString(3) %>"></td>
	</tr>
	<tr>
		<th>회원주소</th>
		<td><input type="text" name="address" value="<%=rs.getString(4) %>"></td>
	</tr>
	<tr>
		<th>가입일자</th>
		<td><input type="text" name="joindate" value="<%=rs.getString(5).substring(0,10) %>"></td>
	</tr>
	<tr>
		<th>고객등급[A:VIP, B:일반, C:직원]</th>
		<td><input type="text" name="grade" value="<%=rs.getString(6) %>"></td>
	</tr>
	<tr>
		<th>도시코드</th>
		<td><input type="text" name="city" value="<%=rs.getString(7) %>"></td>
	</tr>
	<tr>
		<th colspan="2">
			<input type="submit" value="수정"> &nbsp;
			<input type="button" value="조회" onclick="location.href='list.jsp'">
		</th>
	</tr>
	<% } %>
</table>
</form>




</section>
<footer>
<!-- 하단 구역 -->
<p>HRDKOREA Copyright&copy;2016 All rights reserved Human Resources Development Service of Korea</p>
</footer>
<%	
  	}catch(Exception e){
  		e.printStackTrace();
  	}finally{
  		if(rs!=null) rs.close();
  		if(pst != null) pst.close();
  		if(conn!= null) conn.close();
  	}
%>
</body>
</html>