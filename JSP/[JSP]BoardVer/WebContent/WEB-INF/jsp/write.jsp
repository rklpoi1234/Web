<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title> <!-- list에서 건너왔습니다 -->
</head>
<body>
	<h1>write</h1>
	<form action="/write" method="post">
	 <!-- input요소들에 사용자가 입력한 정보들을 서버로 넘기면서 요청하는 역할을 수행 -->
	 <!-- 입력한값을들 (action) write경로를제시 요청전송방식을(method) post방식으로 -->
	<div>
		제목 : <input type="text" name="title"><!--서블릿에서 파라미터를 불러올때 name값을읽습니다 -->
	</div>
	<div>
		내용 : <textarea rows="10" cols="10" name="ctnt"></textarea>
	</div>
	<div>
		<input type="submit" value="글쓰기">
		<input type="reset" value="초기화">
	</div>
	</form>
</body>
</html>
