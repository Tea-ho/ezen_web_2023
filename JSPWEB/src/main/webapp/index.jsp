<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	JSP �� ������Ʈ ���� [ctrl+f11]
	<h3> [C:����] �Է¹��� ������ �̵�(����): JS -> ���� -> DAO </h3>
	Data: <input type = "text" class = "inputdata">
	<button type="button" onclick="ex1()"> ���� </button>
	
	<!-- �ֽ� jquery(js ���̺귯��) import (ajax �Լ� Ȱ���ϱ� ����) -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	
	<!-- JS import (���: /������Ʈ��/[webapp��������]/����/���ϸ� -->
	<script src="/JSPWEB/js/index.js" type="text/javascript"></script>
	
	<h3> [R: �б�] DB -> DAO -> ����[java] -> JS -> HTML  </h3>
	<div class="ex2box">
	
	</div>
	
	<h3> ����[C] </h3>
	input_data: <input type="text" class="homework">
	<button type="button" onclick="homework1()"> Submit </button>
	
	<h3> ����[R] </h3>
	<div class = "hwbox">
	</div>
	
	
</body>
</html>