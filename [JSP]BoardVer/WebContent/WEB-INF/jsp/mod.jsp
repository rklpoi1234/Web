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
		���� : <input type="text" name="title" value="<%=vo.getTitle()%>">
	</div>
	<div>
		���� : <textarea rows="10" cols="10" name="ctnt"><%=vo.getCtnt() %></textarea>
	</div>
	<div>
		<input type="submit" value="����">
		<input type="reset" value="�ʱ�ȭ">
	</div>
	</form>

</body>
</html>