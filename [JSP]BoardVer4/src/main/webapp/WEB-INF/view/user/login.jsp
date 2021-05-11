<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<div>
		<div>
			<form action="login" method="post">
			<div><input type="text" name="uid" placeholder="id"></div>
			<div><input type="password" name="upw" placeholder="pass"></div>
			<div>
				<input type="submit" value="login">
			</div>
			</form>
		</div>
		<div>
			<a href="join">회원가입</a>
		</div>
	</div>

</body>
</html>