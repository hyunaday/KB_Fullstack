<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-01
  Time: 오전 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>새 Todo 생성</h1>
<form method="POST">
    제목 : <input type="text" name="title">
    내용 : <textarea name="content" id="" cols="30" rows="10"></textarea>
    <input type="submit" value="제출">
</form>
</body>
</html>
