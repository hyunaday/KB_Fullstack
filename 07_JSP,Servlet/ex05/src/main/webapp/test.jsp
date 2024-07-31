<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    Integer age = null; // 지역변수
    request.setAttribute("age", 40); // request scope
%>
<head>
    <title>Title</title>
</head>
<body>
<%--스크립트릿 언어--%>
<%--지역 변수를 가져온다--%>
<%--null 설정 시 그대로 "null"이란 글자가 나온다--%>
    변수 age :  <%= age%> <br>
<%--EL(Expression Language)--%>
<%--작은 범위부터 타고 올라가면서 해당 값을 찾는다--%>
<%--null일 경우 알아서 공백으로 처리해준다--%>
<%--page -> request -> session -> application--%>

<%--scope가 지정되어 있는 것부터 찾는다. 지역변수를 찾지 않음--%>
    EL age : ${age}
</body>
</html>
