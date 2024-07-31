<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>scope 데이터 보기</h1>
<%--null이면 공백으로 출력--%>
<%--각 scope들을 돌면서 scopeName에 저장해둔 값을 가져온다--%>
<%--scope.jsp 실행 시, 데이터는 ScopeServlet에 저장되어 있으므로 브라우저창 주소에서 .jsp 지우면 데이터를 가져올 수 있다--%>
pageScope의 속성값은 : ${pageScope.scopeName} <br>
requestScope의 속성값은 : ${requestScope.scopeName} <br>
sessionScope의 속성값은 : ${sessionScope.scopeName} <br>
applicationScope의 속성값은 : ${applicationScope.scopeName} <br>
</body>
</html>
