<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list2</title>
<script defer src="/res/js/boardList.js">
</script>
</head>
<body>
	<h1>list2</h1>
	<div>
		${loginUser.unm }님 (${loginUser.uid }) welcome
	</div>
	<a href="/board2/logout">logout</a>
	<a href="/board/write2">write</a>
	<table>
		<tr>
			<td>no</td>
			<td>title</td>
			<td>iuser</td>
			<td>regdt</td>
		</tr>
		<c:forEach items="${list }" var="item">
			<tr onclick="moveToDetail(${item.iboard})">
				<td>${item.iboard }</td>
				<td>${item.title}</td>
				<td>${item.iuser}</td>
				<td>${item.regdt }</td>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>