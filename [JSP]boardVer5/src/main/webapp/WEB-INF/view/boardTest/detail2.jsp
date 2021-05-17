<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<h1>detail</h1>
	<div>${param.iboard }</div>
	<div>${BoardUser.title }</div>
	<div>${BoardUser.ctnt }</div>
	<a href="/board2/del2">delete</a>
	<a href="/board2/mod2">update</a>

</body>
</html>