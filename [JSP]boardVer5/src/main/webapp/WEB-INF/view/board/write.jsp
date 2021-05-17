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
		<form action="write" method="post">
			<div><input type="text" name="title" placeholder="제목"></div>
			<div><textarea name="ctnt" placeholder="내용"></textarea></div>
			<div>
				<input type="submit" value="write">
				<input type="reset" value="reset">
			</div>
		</form>	
	</div>
</body>
</html>