<%@page import="com.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	BoardVO vo = (BoardVO) request.getAttribute("list"); //마찬가지 서블릿set한걸가져옴
    	String no = request.getParameter("no"); //마찬가지로 앞에 no에가져옴 list.jsp참조
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
		제목 : <input type="text" name="title" value="<%=vo.getTitle()%>"><!-- value값에 전에있던값을넣어서 제목내용그대로나옴 -->
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
