<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>write</title>
</head>
<body>
	<h1>글쓰기</h1>
	<form action="/write" method="post">
	<div>
		제목 : <input type="text" name="title">	
	</div>
	<div>
		내용 : <textarea rows="10" cols="10" name="ctnt"></textarea>
	</div>
	<div>
		<input type="submit" value="글쓰기">
		<input type="reset" value="초기화">
	</div>
	
	</form>

</body>
</html>