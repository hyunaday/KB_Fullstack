<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-06
  Time: 오후 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%--파일 업로드를 위해 enctype 설정 필수--%>
<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">
<div>
<%--    // 해당 input의 name이 받아주는 메소드의 매개변수로 연결된다 (중요)--%>
<%--    하나의 input에는 file 하나만 업로드하는 것이 디폴트다--%>
    <input type="file" name="files">
</div>
    <div>
        <input type="file" name="files">
    </div>
    <div>
        <input type="file" name="files">
    </div>
    <div>
        <input type="file" name="files">
    </div>
    <div>
        <input type="file" name="files">
    </div>
    <div>
        <input type="submit">

    </div>
</form>
</body>
</html>
