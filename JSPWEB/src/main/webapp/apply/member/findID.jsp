<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="/JSPWEB/apply/css/signup.css" rel="stylesheet">
</head>
<body>

	<%@ include file = "../header.jsp" %>
	
	<div class="container">
		<h3> 아이디 찾기 </h3>
		<p> 회원님의 계정 정보를 찾아드립니다. </p>
	
		<form class="signupForm" enctype="multipart/form">
		
			<div class="title"> 이메일 </div>
			<input type="text" name="memail" class="memail" id="memail"> <br/>
			<div class = "checkconfirm"></div>
			<button class="signupbtn" onclick="findID()" type="button"> 아이디찾기 </button>	
			
		</form>
	</div>

	<script src="/JSPWEB/apply/js/member/login.js" type="text/javascript"> </script>
</body>
</html>