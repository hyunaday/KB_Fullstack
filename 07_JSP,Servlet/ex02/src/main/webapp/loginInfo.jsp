<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인 입력 파라미터 출력</h1>
<%--getParameter로 request.jsp 에서 넘어온 데이터 중 해당 키의 value값을 가져온다--%>
<%
    String userid = request.getParameter("userid");
    String Password = request.getParameter("password");
//    String strAge = request.getParameter("age");
//    intz age = strAge !=null ? Integer.parseInt(strAge) : -1;
%>
<%--http://localhost:8080/loginInfo.jsp?userid=hyuna&password=1234--%>
<%--주소로 받아온 값이 출력된다--%>
아이디값: <%= userid%></br>
비밀번호: <%= Password%> <br>
<%--나이: <%=age%>--%>
</body>
</html>
