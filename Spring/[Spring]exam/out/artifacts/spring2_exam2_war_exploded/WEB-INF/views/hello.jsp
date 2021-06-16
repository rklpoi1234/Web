<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>안녕</title>
    <meta charset="UTF-8">
</head>
<body>
    <div>
        <form action="result" method="post">
        <div>
            year :
            <select name="deal_year">
                <c:forEach begin="2000" end="2020" var="year">
                    <option value="${year}">${year}년</option>
                </c:forEach>
            </select>
            mount :
            <select name = "deal_month">
                <c:forEach begin="1" end="12" var="mon">
                    <option value="${mon}">${mon}월</option>
                </c:forEach>
            </select>

            area : deagusi
            <select name="extarnalAreaCd">
                <c:forEach items="${requestScope.List}" var="item">
                    <option value="${item.extarnalAreaCd}">${item.localArea}</option>
                </c:forEach>
            </select>
            <input type="submit" name="제출">
        </div>
        </form>
    </div>
</body>
</html>
