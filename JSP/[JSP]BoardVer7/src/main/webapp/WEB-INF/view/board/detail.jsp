<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div><a href="#" onclick="goBack();">back to list</a></div>
 <h1>${requestScope.data.title}</h1>
 <div>iboard : ${requestScope.data.iboard }</div>
 <div>name : <c:out value="${requestScope.data.writerNm}"/> | regdt : ${requestScope.data.regdt }</div>
 <div> <c:out value="${requestScope.data.ctnt }"/></div>
 
 <div>
	<form id="cmtFrm" data-login_user_pk="${sessionScope.loginUser.iuser}" data-iboard="${param.iboard}" onsubmit="return false;">
		<input type="text" id="cmt">
		<input type="button" value="댓글달기" onclick="regCmt();">
	</form>
 </div>
 
 <div id="cmtList" data-login_user_pk="${sessionScope.loginUser.iuser}" data-iboard="${param.iboard}" onsubmit="return false;">
</div>
 <script src="/res/js/BoardDetail.js"></script>