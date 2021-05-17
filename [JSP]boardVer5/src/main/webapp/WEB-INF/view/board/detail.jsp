<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<h1>detail page</h1>
	<div>
		${param.iboard }	
	</div>
	<div>num : ${data.iboard}</div>
	<div>title : ${data.title }</div>
	<div>nm : ${data.unm }</div>
	<div>regdt : ${data.regdt }</div>
	<div>
		내용 : 
		${data.ctnt }
	</div>
	
	<c:if test="${loginUser.iuser == data.iuser }">
	<div>
		<a href="/board/del?iboard=${param.iboard }">delete</a>
		<a href="/board/mod?iboard=${param.iboard }">update</a>
	</div>
	</c:if>

	
</body>
</html>