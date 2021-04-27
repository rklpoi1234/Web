<%@page import="com.web.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	List<BoardVO> list = (List<BoardVO>)request.getAttribute("data");
	//getAttribute���ߴٸ� �������� setAttrubute�������̴ϴ� Ű���� "data"
	//�� Database��(public final static ��) list�� ��û�ؼ� ������
	//+ Attribute�� ������ objectŸ������ �ǳʿ��� ���Ķ���ʹ� ��Ʈ��Ÿ�����ΰǳʿɴϴ�.
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
				<td>title</td> <!--��ĭ(tr)no title ������ view���-->
			</tr> <!--���⼭���ʹ� �����ͺ��̽��� ���̵��;� �߰����˴ϴ� ����...-->
			<% for(int i = 0;i<list.size();i++) { %> //�޾ƿ� Ű�� databaseŬ������ �迭�����ŭ����
            <%			BoardVO vo = list.get(i); %> <!--<del>//����Ÿ���̽�����Ʈ���̵��¸�ŭ (write����add)vo�ּҰ��� i��ŭ����</del>-->
			
			<tr>
				<td> <%=i %></td> <!--no�ؿ� i���̵� 0~...-->
				<td>
					<a href="/detail?no=<%=i%>"><%=vo.getTitle() %></a> <!--title�ؿ� BoardVOŬ���� title���� ����-->
				</td>
			</tr>	
			<% } %>
		</table>
	
	</div>
</body>
</html>