<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
 <link rel="stylesheet" href="/resources/style.css">
</head>
<body>
<h1>Board Register Page</h1>
<br>
	<form action="/brd/insert" method="post" enctype="multipart/form-data">
	<div class="container mt-3">
	
  
    <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Title : </span>
    </div>
    <input type="text" class="form-control" name="title">
  </div>
    <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Writer : </span>
    </div>
    <input type="text" class="form-control" name="writer" value="${ses.email }" readonly>
  </div>
    <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Content : </span>
    </div>
   <textarea class="form-control" rows="3" cols="30" name="content"></textarea><br>
	<div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text"> Image File </span>
    </div>
    <input type="file" id="file" class="form-control" name="image_file" 
			accept="image/png, image/jpg, image/jpeg, image/gif">
  </div>
  </div>
  <button type="submit">등록</button>
</div>
</form>
	<%-- <form action="/brd/insert" method="post" enctype="multipart/form-data">
		title : <input type="text" name="title"> <br>
		writer : <input type="text" name="writer" value="${ses.email }" readonly="readonly"> <br>
		content : <textarea rows="3" cols="30" name="content"></textarea><br>
		image_file : <input type="file" id="file" name="image_file" 
			accept="image/png, image/jpg, image/jpeg, image/gif">
		<button type="submit">등록</button>
	</form> --%>
</body>
</html>