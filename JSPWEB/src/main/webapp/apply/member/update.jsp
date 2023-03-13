<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file = "/apply/header.jsp" %>
	
	<div class="container">
	
		<h3> 회원정보 </h3>
		<div>
			<div>
				<img class="mimg" alt="" src="">
			</div>
			<div>
				<div> 아이디 </div>
				<div class="mid"></div>
			</div>
			<div>
				<div> 현재 비밀번호 </div>
				<div class="memail"></div>
			</div>
			<div>
				<div> 변경할 비밀번호 </div>
				<div class="mpoint"></div>
			</div>
			<div>
				<div> 변경할 비밀번호 확인 </div>
				<div class="mpoint"></div>
			</div>
			<div>
				<div> 이메일 주소 </div>
				<div class="mpoint"></div>
			</div>
			
			<button onclick="setUpdate()" type="button"> 정보수정 </button>ㄴ
			
		</div>
	</div>
	



</body>
</html>