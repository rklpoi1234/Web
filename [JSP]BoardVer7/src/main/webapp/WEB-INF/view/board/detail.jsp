<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <div><a href="/board/list">back to list</div>
 <h1>${requestScope.data.title}</h1>
 <div>iboard : ${requestScope.data.iboard }</div>
 <div>name : ${requestScope.data.unm} | regdt : ${requestScope.data.regdt }</div>
 <div> <c:out value="${requestScope.data.ctnt }"/>