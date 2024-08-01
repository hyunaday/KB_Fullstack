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
    <div>
        <%--    EL을 사용해서 todoList 접근--%>
            ${todoList}
        <%--    상대경로기 때문에 todo 폴더를 접근할 필요 없음--%>
                <a href="view">상세보기</a>
    </div>
    <div>
        <a href="create">새 Todo</a>
    </div>

<%-----------------------------------------------------------%>
<%--foreach문 활용--%>
<%--<div>--%>
<%--    &lt;%&ndash; EL을 사용해서 todoList 접근 &ndash;%&gt;--%>
<%--    <c:forEach var="todo" items="${todoList}">--%>
<%--        <div>--%>
<%--                &lt;%&ndash; todo 항목을 출력하거나 필요한 정보 표시 &ndash;%&gt;--%>
<%--            <p>${todo.title}</p>  &lt;%&ndash; 예시로 title 속성을 사용함 &ndash;%&gt;--%>
<%--                &lt;%&ndash; 상세보기 링크, todo ID를 쿼리 파라미터로 전달 &ndash;%&gt;--%>
<%--            <a href="view?id=${todo.id}">상세보기</a>--%>
<%--        </div>--%>
<%--    </c:forEach>--%>
<%--</div>--%>
<%-----------------------------------------------------------%>

</body>
</html>
