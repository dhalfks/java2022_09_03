<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	    Connection conn = null;
	  	PreparedStatement pst = null;
	  	ResultSet rs = null;
	  	
	  	String sql = "select * from member_tbl_02 where grade is not null order by custno";
	  	try{
	  		Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","ezen");
			pst = conn.prepareStatement(sql);
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
<h2>회원목록조회/수정</h2>
 <table>
 <tr>
 	<th>회원번호</th> 
 	<th>회원성명</th>
 	<th>전화번호</th>
 	<th>주소</th>
 	<th>가입일자</th>
 	<th>고객등급</th>
 	<th>거주지역</th>
 </tr>
 <%
 while(rs.next()){
	 //고객등급에 대한 분류
	 //System.out.println(rs.getInt(1)+": "+rs.getString(5)+": "+rs.getString(6));
	 String grade = "";
	 if(rs.getString(6).equals("A")) grade="VIP";
	 if(rs.getString(6).equals("B")) grade="일반";
	 if(rs.getString(6).equals("C")) grade="직원";
 
 %>
 
 <tr>
 	<td><a href="update.jsp?custno=<%=rs.getInt(1)%>"><%=rs.getInt(1)%></a></td>
 	<td><%=rs.getString(2) %></td>
 	<td><%=rs.getString(3) %></td>
 	<td><%=rs.getString(4) %></td>
 	<td><%=rs.getString(5).substring(0,10) %></td>
 	<td><%=grade %></td>
 	<td><%=rs.getString(7) %></td>
 </tr>
 <%
 }
 %>
 </table>
 
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