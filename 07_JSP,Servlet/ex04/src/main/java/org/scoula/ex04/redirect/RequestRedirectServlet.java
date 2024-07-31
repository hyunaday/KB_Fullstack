package org.scoula.ex04.redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestRedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 해당 요청은 내부테어 쓰이지 않으므로 무의미하다
        // 속성 설정
        request.setAttribute("username", "홍길동");
        request.setAttribute("useradress", "서울");

        // response.redirect URL로 Redirect 시킨다.
        response.sendRedirect("response_redirect");
    }
}
