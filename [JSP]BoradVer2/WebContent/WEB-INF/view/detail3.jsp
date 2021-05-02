<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>detail</title>
</head>
<body>
	<h1>detail</h1>
	<div><a href="/list3">list</a></div>
	<div>title : ${data.title }</div>
	<div>regdt : ${data.regdt }</div>
	<div>
		${data.ctnt }
	</div>

</body>
</html>