<%@page import="com.web.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	List<BoardVO> list = (List<BoardVO>)request.getAttribute("data");
	//getAttribute를했다면 서블릿에는 setAttrubute를했을겁니다 키값은 "data"
	//즉 Database에(public final static 함) list를 요청해서 가져옴
	//+ Attribute는 무조건 object타입으로 건너오고 겟파라미터는 스트링타입으로건너옵니다.
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
		<a href="/write">write</a> <!--webservlet toss-->
	</div>
	<div>
		<table>
			<tr>
				<td>no</td>
				<td>title</td> <!--한칸(tr)no title 순으로 view출력-->
			</tr> <!--여기서부터는 데이터베이스에 값이들어와야 추가가됩니다 펀쿨섹...-->
			<% for(int i = 0;i<list.size();i++) { %> //받아온 키값 database클래스안 배열사이즈만큼루프
            <%			BoardVO vo = list.get(i); %> <!--<del>//데이타베이스리스트값이들어온만큼 (write에서add)vo주소값이 i만큼루프</del>-->
			
			<tr>
				<td> <%=i %></td> <!--no밑에 i값이들어감 0~...-->
				<td>
					<a href="/detail?no=<%=i%>"><%=vo.getTitle() %></a> <!--title밑에 BoardVO클래스 title값이 들어옴-->
				</td> <!--a태그로 감싸져 detail?no"인덱스값"형식으로-->
			</tr>	
			<% } %>
		</table>
	
	</div>
</body>
</html>
