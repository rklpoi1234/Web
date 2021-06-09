<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-06-09-009
  Time: 오전 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>${requestScope.title}</title>
    <link rel="stylesheet" href="/res/css/common.css">
    <link rel="stylesheet" href="/res/css/<tiles:getAsString name="res"/>.css">
    <script defer src="/res/js/common.js"></script>
    <script defer src="/res/js/<tiles:getAsString name="res"/>.js"></script>
</head>
<body>
    <div id="container">
        <tiles:insertAttribute name="header"/>
        <section>
            <tiles:insertAttribute name="content"/>
        </section>
        <footer>
            Copyright 2012.
        </footer>
    </div>

</body>
</html>
