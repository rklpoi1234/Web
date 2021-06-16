<%@page import="com.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% 
    	String no = request.getParameter("no");
    	//앞에서 detail?no=<%i..에서 no(i)을 가져옴
    	BoardVO vo = (BoardVO)request.getAttribute("list"); 
    	//서블릿에서 set한거 vo로 가져옴 마찬가지 obj타입이기때문에 확실히
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>detail<%=no %></h1> <!-- no를사용해현재번호알려줌 -->
	<div>
		제목 : <%=vo.getTitle() %> //해당 주소값 title을 불러옴
	</div>
	<div>
		내용 : <%=vo.getCtnt() %> //...
	</div>

	<div>
		<form action="/del" method="post">
			<input type="hidden" name="no" value="<%=no %>">
			<!-- del 서블릿에 no값을 념겨주기위해서 BoarddelServlet참조 -->
			<input type="submit" value="del">	
		</form>
		<a href="/mod?no=<%=no%>"><button>수정s</button></a><!-- get방식으로넘김 -->
	</div>
</body>
</html>
