<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-01
  Time: 오전 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Todo 목록 보기</h1>
<%--    <div>--%>
<%--     EL을 사용해서 todoList 접근--%>
<%--            ${todoList}--%>
<%--        상대경로기 때문에 todo 폴더를 접근할 필요 없음--%>
<%--                <a href="view">상세보기</a>--%>
<%--    </div>--%>

<%-----------------------------------------------------------%>
<%--foreach문 활용--%>
    <div>
        <ul>
            <c:forEach var="todo" items="${todoList}">
                <li>${todo}</li>
            </c:forEach>
        </ul>
    </div>
<%-----------------------------------------------------------%>
    <div>
        <a href="view">상세보기</a>
        <a href="create">새 Todo</a>
    </div>

</body>
</html>
