<%@page import="com.web.board.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	String no = request.getParameter("no");
    	BoardVo vo = (BoardVo)request.getAttribute("data");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>detail.jsp</title>
</head>
<body>
	<h1>detail <%=no %></h1>
	<div><%=request.getParameter("no") %></div>
	<div>
		<form action="/del" method="post">
			<input type="hidden" name="no" value="<%=no%>">
			<input type="submit" value="delete">

		</form>
		
	</div>
	<div>제목 : <%=vo.getTitle() %></div>
	<div><%=vo.getCtnt() %></div>
</body>
</html>