<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>write</h1>
	<form action="/write" method="post">
	<div>
		���� : <input type="text" name="title">
	</div>
	<div>
		���� : <textarea rows="10" cols="10" name="ctnt"></textarea>
	</div>
	<div>
		<input type="submit" value="�۾���">
		<input type="reset" value="�ʱ�ȭ">
	</div>
	</form>
</body>
</html>