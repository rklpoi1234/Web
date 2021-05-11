<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login here</title>
</head>
<body>

	<div>
		<div class="errMsg">${errMsg }</div>
		<div>
			<form action="login" method="post">
				<div><input type="text" name="uid" placeholder="id"></div>
				<div><input type="text" name="upw" placeholder="password"></div>
				<div>
					<input type="submit" value="Login">
				</div>
			</form>
		</div>
		<div>
			<a href="/user/join">회원가입</a>
		</div>	
		
	</div>
</body>
</html>