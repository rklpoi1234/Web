<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mod</title>
</head>
<body>
	<h1>mod</h1>
	<div>
		<form action="mod" method="post">
			<input type="hidden" name="iboard" value="${param.iboard}">
			<div><input type="text" name="title" placeholder="제목" value="${vo.title }"></div>
			<div><textarea name="ctnt" placeholder="내용" >${vo.ctnt }</textarea></div>
			<div>
				<input type="submit" value="write">
				<input type="reset" value="reset">
			</div>
		</form>	
	</div>
</body>
</html>