<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
</head>
<body>

	<h1>write</h1>
	<div>
		<form action="/board/write2" method="post">
			<div><input type="text" name="title" placeholder="id"></div>
			<div><input type="text" name="ctnt" placeholder="password"></div>
			<input type="submit" name="write">
			<input type="reset" name="reset">
		</form>
	</div>
</body>
</html>