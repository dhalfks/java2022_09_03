<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Board Modify Page</h1>
	<form action="/brd/update" method="post" enctype="multipart/form-data">
	<div class="container mt-3">
	
  <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Bno : </span>
    </div>
    <input type="text" class="form-control" name="bno" value="${bvo.bno }" readonly>
  </div>
    <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Title : </span>
    </div>
    <input type="text" class="form-control" name="title" value="${bvo.title }">
  </div>
    <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Writer : </span>
    </div>
    <input type="text" class="form-control" name="writer" value="${bvo.writer }" readonly disabled="disabled">
  </div>
    <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Content : </span>
    </div>
   <textarea class="form-control" rows="3" cols="30" name="content">${bvo.content }</textarea><br>

  </div>
  <div class="input-group mb-3">
    <div class="input-group-prepend">
      <span class="input-group-text">Image File </span>
      <input type="hidden" class="form-control" name="image_file"  value="${bvo.image_file }">
    </div>
    <input type="file" class="form-control" name="new_file"  accept="image/png, image/jpeg, image/jpg, image/gif">
  </div>
  <button type="submit">수정</button>
</div>
</form>
<%-- <form action="/brd/update" method="post" enctype="multipart/form-data">
bno : <input type="text" name="bno" value="${bvo.bno }" readonly><br>
title: <input type="text" name="title" value="${bvo.title }"><br>
writer: <input type="text" name="writer" value="${bvo.writer }" readonly="readonly"><br>
content: <textarea rows="3" cols="30" name="content">${bvo.content }</textarea><br>
image_file : 
<input type="hidden" name="image_file" value="${bvo.image_file }">
<input type="file" name="new_file" 
	accept="image/png, image/jpg, image/jpeg, image/gif">
<button type="submit">수정</button>
</form> --%>
</body>
</html>