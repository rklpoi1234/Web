<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>

	<div>로그인 성공</div>
	<div>${loginUser.unm }님 (${loginUser.uid }) 환영합니다.</div> <a href="/user/logout">Logout</a>
	<div>
		<a href="/board/write"><button>write</button></a>
	</div>
	
	<div>
		<table>
			<tr>
				<th>no</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>작성일</th>
			</tr>
		
			<c:forEach items="${list}" var="item">
				<tr class="record" onclick="moveToDetail(${item.iboard});">
					<td>${item.iboard }</td>
					<td>${item.title }</td>
					<td>${item.unm }</td>
					<td>${item.regdt }</td>
				</tr>	
			</c:forEach>
		</table>
	</div>
	<script src="/res/js/boardList">
		
	</script>
</body>
</html>