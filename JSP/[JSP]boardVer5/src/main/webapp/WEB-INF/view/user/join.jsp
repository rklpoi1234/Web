<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
</head>
<body>
	<h1>join</h1>
	<div>
		<form action="/user/join" method="post">
			<div><input type="text" name="uid" placeholder="id"></div>
			<div><input type="text" name="upw" placeholder="password"></div>
			<div><input type="text" name="unm" placeholder="unm"></div>
			gender : 
			<label>female<input type="radio" name="gender" value="0" checked="checked"></label>
			<label>male<input type="radio" name="gender" value="1" ></label>
			<input type="submit" name="join">
		</form>
	</div>

</body>
</html>