package org.scoula.dynamicweb.ex03;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sports")
public class SportsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//        sports에 저장되어 있는 값이 여러개이므로 getParameterValues를 통해 배열로 받아옴
        String[] sports = request.getParameterValues("sports");
        String sex = request.getParameter("sex");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        // 체크된 값들을 돌면서 하나씩 출력한다
        for (String sport : sports) {
            out.print("좋아하는 운동: " + sport + "<br>");
        }
//        라디오값은 하나밖에 선택이 안되므로 배열처리할 필요 없음
        out.print("성별 : " + sex + "<br>");
        out.print("</body><html>");
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
