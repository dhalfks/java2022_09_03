<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	//DB연결정보
	Connection conn = null;
	PreparedStatement pst = null;
	//request encoding 설정
	request.setCharacterEncoding("utf-8");
	//jsp에서 받아온 값 변수화
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	
	String sql = "update member_tbl_02 set custname=?, phone=?, address=?, joindate=?, grade=?,city=? where custno=?";
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","ezen");
		System.out.println(address);
		pst = conn.prepareStatement(sql);
		pst.setString(1, custname);
		pst.setString(2, phone);
		pst.setString(3, address);
		pst.setString(4, joindate);
		pst.setString(5, grade);
		pst.setString(6, city);
		pst.setInt(7, Integer.parseInt(custno));
		//res == isOk
		int res = pst.executeUpdate(); //insert, update, delete => executeUpdate()  
		// list => executeQuery()
		
		if(res>0){
			%>
			<script type="text/javascript">
				alert("회원정보수정이 완료되었습니다.");
				location.href='list.jsp'; //뒤로...  다른 경로로 갈때 location.href='list.jsp'
			</script>
		<%}else{
			%>
			<script type="text/javascript">
				alert("회원정보수정이 실패되었습니다.");
				history.back();
			</script>
		<%}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(pst != null)pst.close();
		if(conn != null)conn.close();
	}
%>