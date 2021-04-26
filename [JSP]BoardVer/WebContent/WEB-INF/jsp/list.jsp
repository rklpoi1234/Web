<%@page import="com.web.board.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    List<BoardVo> list = (List<BoardVo>)request.getAttribute("data");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>list.jsp</title>
</head>
<body>
	<h1>list</h1>

	<div>
		<a href="/write">write</a>
	</div>
	<div>
		<table>
			<tr>
				<td>no</td>
				<td>제목</td>
			</tr>
			<% for(int i = 0;i<list.size();i++) { %>
			<%			BoardVo vo = list.get(i); %>	
			
			<tr>
				<td> <%=i %></td>
				<td>
					<a href="/detail?no=<%=i%>"><%=vo.getTitle() %></a>
				</td>
			</tr>	
			<% } %>
		</table>
	
	</div>
</body>
</html>