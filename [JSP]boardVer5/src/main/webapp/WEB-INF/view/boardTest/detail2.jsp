<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
</head>
<body>
	<h1>${BoardUser.title }</h1>
	<div>${BoardUser.iboard }</div>
	<div>unm : ${BoardUser.unm } | regdt: (${BoardUser.regdt })</div>
	<div>${BoardUser.ctnt }</div>
	<div>
		<form action="/board/regCmt" method="post">
			<div>
				<input type="hidden" name="iboard" value="${BoardUser.iboard }">
				<textarea name="cmt" placeholder="댓글내용"></textarea>
				<input type="submit" value="댓글작성">
			</div>
		</form>
	</div>
	<div>
		<table>
			<tr>
				<th>ctnt</th>
				<th>unm</th>
				<th>regdate</th>
				<th>비고</th>
			</tr>
			<c:forEach items="${requestScope.CmtList }" var="item">
				<tr>
					<td>${item.cmt }</td>
					<td>${item.unm }</td>
					<td>${item.regdate }</td>
					<td>
					<c:if test="${item.iuser == sessionScope.loginUser.iuser }">
						<input type="button" value="수정">
					<a href="/board/regCmt?icmt=${item.icmt }&iboard=${requestScope.BoardUser.iboard}"><button>삭제</button></a>
					</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="/board2/del2">delete</a>
	<a href="/board2/mod2">update</a>

</body>
</html>