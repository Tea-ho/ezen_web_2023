<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	JSP 웹 프로젝트 시작 [ctrl+f11]
	<h3> [C:쓰기] 입력받은 데이터 이동(전송): JS -> 서블릿 -> DAO </h3>
	Data: <input type = "text" class = "inputdata">
	<button type="button" onclick="ex1()"> 전송 </button>
	
	<!-- 최신 jquery(js 라이브러리) import (ajax 함수 활용하기 위함) -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	
	<!-- JS import (경로: /프로젝트명/[webapp폴더생략]/폴더/파일명 -->
	<script src="/JSPWEB/js/index.js" type="text/javascript"></script>
	
	<h3> [R: 읽기] DB -> DAO -> 서블릿[java] -> JS -> HTML  </h3>
	<div class="ex2box">
	
	</div>
	
	<h3> 과제[C] </h3>
	input_data: <input type="text" class="homework">
	<button type="button" onclick="homework1()"> Submit </button>
	
	<h3> 과제[R] </h3>
	<div class = "hwbox">
	</div>
	
	
</body>
</html>