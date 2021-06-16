<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>title</title>
</head>
<body>

	<div><a href="/list3">리스트</a></div>
	<form action="/write3" method="post">
		
		<div>제목 : <input type="text" name="title"></div>
		<div>내용 : <textarea name="ctnt"></textarea></div>
		<div>
			<input type="submit" value="등록">
			<input type="reset" value="초기화">
		</div>
		
	</form>
</body>
</html>