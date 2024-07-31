package org.scoula.dynamicweb.ex03.filter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class s5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        POST 메소드의 경우 기본값 인코딩은 한글이 깨지므로 UTF-8 변경 필수!
//        request.setCharacterEncoding("UTF-8");
        // GET 메소드와 동일한 로직을 처리하고 싶으므로 doGet 호출
        doGet(request, response);
    }
}
