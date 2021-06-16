<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h1>login</h1>
	<div>${errMsg}</div>
	<div>
		<form action="/user/login" method="post">
			<div><input type="text" name="uid" placeholder="id" value="kim"></div>
			<div><input type="password" name="upw" placeholder="pass" value="6913"></div>
			<input type="submit" name="login">
		</form>
	</div>
	<div><a href="/user/join">회원가입</div>

</body>
</html>