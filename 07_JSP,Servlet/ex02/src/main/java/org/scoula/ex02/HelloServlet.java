package org.scoula.ex02;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "MyServlet", urlPatterns = {"/xxx","/yyy"})
public class HelloServlet extends HttpServlet {

    // get 요청에 반응하는 메서드
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
        System.out.println("HelloServlet 요청");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello Servlet</h1>");
    }

    // 서블릿 제대로 종료됐을 때 불러주는 메소드
    @Override
    public void destroy() {
        System.out.println("destroy 호출");
    }

    // 서블릿 초기화 해주는 메소드
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init호출");
    }
}