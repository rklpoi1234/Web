<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-06-09-009
  Time: 오후 3:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<header>
    <ul>
        <c:choose>
            <c:when test="${empty sessionScope.loginUser}">
                <li><a href="/user/login">login</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="/user/logout">logout</a></li>
            </c:otherwise>
        </c:choose>
        <li><a href="/">Home</a> </li>
        <li> <a href="/board/list">list</a> </li>
        <c:if test="${not empty sessionScope.loginUser}">
            <li><a href="/board/write">write</a> </li>
            <li><a href="/user/profile">profile</a> </li>
        </c:if>
    </ul>
</header>
