<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>list</title>
</head>
<body>

	<div>
		<a href="/write3">write</a>
	</div>
	<div>
		<table>
			<tr>
				<th>no</th>
				<th>title</th>
				<th>date</th>
			</tr>
			<c:forEach items="${list}" var="item">
				<tr class="record" onclick="moveToDetail(${item.iboard});">
					<td>${item.iboard }</td>
					<td>${item.title }</td>
					<td>${item.regdt }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<script>
		function moveToDetail(iboard){
			location.href = "/detail3?iboard=" + iboard;
		}	
	</script>

</body>
</html>