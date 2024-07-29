package org.scoula.dynamicweb.ex03;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        // 받아온 파라미터들의 이름만을 열거자로 만듦
        Enumeration<String> enu = request.getParameterNames();

        // hasMoreElements : 요소가 더 있는지 체크해서 없을 때까지 돈다
        while (enu.hasMoreElements()) {
            // nextElement : 열거자를 돌면서 다음 요소를 가져옴
            String name = enu.nextElement();
            // 열거자에 저장된 이름으로 해당 값들을 가져옴
            String value = request.getParameter(name);
            // hidden이었던 action 값도 출력된다
            out.println(name + ":" + value + "<br>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        POST 메소드의 경우 기본값 인코딩은 한글이 깨지므로 UTF-8 변경 필수!
        request.setCharacterEncoding("UTF-8");
        // GET 메소드와 동일한 로직을 처리하고 싶으므로 doGet 호출
        doGet(request, response);
    }
}
