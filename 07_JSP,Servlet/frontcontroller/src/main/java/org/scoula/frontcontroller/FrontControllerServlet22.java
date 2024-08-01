package org.scoula.frontcontroller;

import org.scoula.frontcontroller.command.Command;
import org.scoula.frontcontroller.controller.HomeController;
import org.scoula.frontcontroller.controller.TodoController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//@WebServlet("/")
//경로 지정하는 방법은 두가지가 있다, 1) 디렉토리 기반, 2) 확장명 기반
//디렉토리 기반(/board), 확장명 기반(*.do)
@WebServlet(name="frontControllerServlet", value="/")
public class FrontControllerServlet22 extends HttpServlet {
    Map<String, Command> getMap; // GET 요청이 들어왔을 경우 사용할 맵
    Map<String, Command> postMap; // POST 요청이 들어왔을 경우 사용할 맵

    // 뷰의 기본 경로와 확장자를 설정해준다
    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";

    // HomeController 객체 생성
    HomeController homeController = new HomeController();
    // TodoController 객체 생성
    TodoController todoController = new TodoController();

    // 서블릿 초기화 메소드
    @Override
    public void init() throws ServletException {
        // Map은 인터페이스이므로 구현 클래스인 HashMap으로 객체 생성
        getMap = new HashMap<>();
        postMap = new HashMap<>();

//        "/"경로로 접근하면 HomeController의 getIndex 메소드를 찾을 수 있다. (메소드 참조)
//        put으로 Map에 아이템을 넣어준다
        getMap.put("/", homeController::getIndex);

        getMap.put("/todo/list", todoController::getList);
                getMap.put("/todo/view", todoController::getView);
        getMap.put("/todo/update", todoController::getUpdate);
        getMap.put("/todo/create", todoController::getCreate);

        postMap.put("/todo/delete", todoController::postDelete);
        postMap.put("/todo/update", todoController::postUpdate);
        postMap.put("/todo/create", todoController::postCreate);

        // 실제 경로
//        getMap.put("/", new Command() {
//            @Override
//            public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
//                return new HomeController().getIndex(request, response);
//            }
//        });

    }

    public void execute(Command command, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 실행 결과는 jsp의 이름으로 받아온다.
        String viewName = command.execute(request, response);
        if (viewName.startsWith("redirect:")) { // redirect 처리
            // redirect로 처리할 경우 view의 경로에서 "redirect:"를 제외하고 띄운다
            response.sendRedirect(viewName.substring("redirect:".length()));
        } else {
            // forward로 처리할 경우
            // 가지고 온 뷰의 이름에 "/view/"를 앞에, ".jsp"를 뒤에 붙여준다.
            String view = prefix + viewName + suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }

    }
    // GET 요청을 처리해주는 메소드
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Command command = getCommand(request);
        if(command != null) {
            execute(command,request,response);
        }else {
            // 없는 페이지일 경우 404 에러로 처리
            String view = prefix + "404" + suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    // 요청 URL에서 식별값만 잘라서 return해주는 메소드
    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI(); // "/context값/식별값"
        String contextPath = request.getContextPath(); // "/context값"
        // substring(시작인덱스) : 해당 인덱스부터 문자열을 잘라준다.
        return requestURI.substring(contextPath.length()); // "/식별값"
    }

    // 요청 URL에서 식별값에 해당하는 Command를 return해주는 메소드
    private Command getCommand(HttpServletRequest request) {
        // request에서 command 이름만 추출
        String commandName = getCommandName(request);
        Command command;

        // equalsIgnoreCase("GET") : "get"이라는 단어와 대소문자 구분없이 비교
        // request에서 받아온 메소드가 GET이면 getMap에서 커맨드 찾기
        if(request.getMethod().equals("GET")) {
            command = getMap.get(commandName);
        } else{
            // request에서 받아온 메소드가 POST면 postMap에서 커맨드 찾기
            command = postMap.get(commandName);
        }
        return command;
    }

}
