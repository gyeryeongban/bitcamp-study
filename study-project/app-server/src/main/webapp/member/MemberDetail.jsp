<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
  <title>회원상세</title>
  <link rel="stylesheet" href="../node_modules/bootstrap/dist/css/bootstrap.css">
  
  <script src="../node_modules/@popperjs/core/dist/umd/popper.js"></script>
  <script src="../node_modules/bootstrap/dist/js/bootstrap.js"></script>
  
  <style>
    .container {
        xborder: 1px solid red;
        width: 640px;
    }
  </style>
</head>
<body>
<div class="container">
<h1>회원 상세(MVC + EL2)</h1>
<form action='update'>
    <div class="mb-3 row">
  <label for='f-no' class="col-sm-2 col-form-label">번호</label>
  <div class="col-sm-6">
    <input id='f-no' type='text' name='no' value="${member.no}" class="form-control">
  </div>
</div>
    <div class="mb-3 row">
  <label for='f-name' class="col-sm-2 col-form-label">이름</label>
  <div class="col-sm-6">
    <input id='f-name' type='text' name='name' value="${member.name}" class="form-control">
  </div>
</div>
<div class="mb-3 row">
  <label for='f-email' class="col-sm-2 col-form-label">이메일</label>
  <div class="col-sm-10">
    <input id='f-email' type='email' name='email' value="${member.email} class="form-control">
  </div>
</div>
<div class="mb-3 row">
  <label for='f-password' class="col-sm-2 col-form-label">암호</label>
  <div class="col-sm-6">
    <input id='f-password' type='password' name='password' value="${member.password} class="form-control">
  </div>
</div>
<div class="mb-3 row">
  <label for='f-photo' class="col-sm-2 col-form-label">사진</label> 
  <div class="col-sm-10">
    <input id='f-photo' type='text' name='photo' value="${member.photo} class="form-control">
  </div>
</div>
<div class="mb-3 row">
  <label for='f-tel' class="col-sm-2 col-form-label">전화</label> 
  <div class="col-sm-10">
    <input id='f-tel' type='tel' name='tel' value="${member.tel} class="form-control">
  </div>
</div>
    <div class="mb-3 row">
  <label for='f-registeredDate' class="col-sm-2 col-form-label">등록일</label> 
  <div class="col-sm-10">
    <input id='f-registeredDate' type='text' name='registeredDate' value="${member.registeredDate} class="form-control">
  </div>
</div>
<button>변경</button>
 <a href='delete?no=${member.no}'>[삭제]</a> <a href='list'>[목록]</a><br>
</form>
</div>
</body>
</html>
