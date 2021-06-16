<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div>
		<a href="login">back to login</a>
	</div>
	<div>
		<form action="join" method="post">
			<div><input type="text" name="uid" placeholder="id"></div>
			<div><input type="password" name="upw" placeholder="pass"></div>
			<div><input type="text" name="unm" placeholder="name"></div>
			<div>
				gender :
				<label>female<input type="radio" name="gender" value="0" checked></label>
				<label>male<input type="radio" name="gender" value="1"></label>
			</div>
			<div><input type="submit" value="회원가입"></div>
		</form>

	</div>


</body>
</html>