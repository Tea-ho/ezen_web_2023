<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 회원가입 </h3>

	<form class="signupForm" enctype="multipart/form">
		아이디:		<input onkeyup="idcheck()" maxlength="30" type="text" name="mid" class="mid" id="mid"> <br/>
		<div class = "idcheck"></div>
		비밀번호:		<input type="text" name="mpw" class="mpw" id="mpw"> <br/>
		비밀번호 확인:	<input type="text" name="mpwc" class="mpwc" id="mpwc"> <br/>
		이메일:		<input type="text" name="memail" class="memail" id="memail"> <br/>
		프로필:		<input type="file" name="mimg" class="mimg" id="mimg"> <br/>
		<button onclick="signup()" type="button"> 가입 </button>	
	</form>

	<!-- 1. 최신 jquery(js 라이브러리) import (ajax 함수 활용하기 위함) -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

	<script src="/JSPWEB/apply/js/member/signup.js" type="text/javascript"> </script>

</body>
</html>