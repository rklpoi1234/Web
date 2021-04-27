<%@page import="com.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	BoardVO vo = (BoardVO) request.getAttribute("list");
    	String no = request.getParameter("no");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>mod</h1>
	<form action="/mod" method="post">
	<input type="hidden" name="wo" value="<%=no %>">
	<div>
		제목 : <input type="text" name="title" value="<%=vo.getTitle()%>">
	</div>
	<div>
		내용 : <textarea rows="10" cols="10" name="ctnt"><%=vo.getCtnt() %></textarea>
	</div>
	<div>
		<input type="submit" value="수정">
		<input type="reset" value="초기화">
	</div>
	</form>

</body>
</html>