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
public class FrontControllerServlet extends DispatcherServlet {

    // HomeController 객체 생성
    HomeController homeController = new HomeController();
    // TodoController 객체 생성
    TodoController todoController = new TodoController();

    protected void createMap(Map<String, Command> map, Map<String, Command> postMap) {

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
}

