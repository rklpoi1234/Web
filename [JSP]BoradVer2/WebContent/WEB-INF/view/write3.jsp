<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>title</title>
</head>
<body>

	<div><a href="/list3">����Ʈ</a></div>
	<form action="/write3" method="post">
		
		<div>���� : <input type="text" name="title"></div>
		<div>���� : <textarea name="ctnt"></textarea></div>
		<div>
			<input type="submit" value="���">
			<input type="reset" value="�ʱ�ȭ">
		</div>
		
	</form>
</body>
</html>