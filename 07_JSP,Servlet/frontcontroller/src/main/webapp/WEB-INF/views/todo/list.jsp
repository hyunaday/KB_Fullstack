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
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            margin: 0;
            padding: 0;
        }
        h1 {
            text-align: center;
            color: #ff6f61;
            margin-top: 20px;
            font-size: 2.5rem;
        }
        .container {
            width: 80%;
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background: #fff;
            border-radius: 15px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        ul {
            list-style: none;
            padding: 0;
        }
        li {
            background: #ffebf0;
            margin: 10px 0;
            padding: 15px;
            border-radius: 12px;
            font-size: 1.2rem;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        a {
            text-decoration: none;
            color: #fff;
            background-color: #ff6f61;
            padding: 10px 20px;
            border-radius: 25px;
            margin: 5px;
            display: inline-block;
            font-weight: bold;
            transition: background-color 0.3s ease, transform 0.2s ease;
        }
        a:hover {
            background-color: #e55d50;
            transform: translateY(-2px);
        }
        .actions {
            margin-top: 20px;
        }
    </style>
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
