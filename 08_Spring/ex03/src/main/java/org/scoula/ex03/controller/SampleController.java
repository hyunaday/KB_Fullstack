package org.scoula.ex03.controller;

import lombok.extern.log4j.Log4j;
import org.scoula.ex03.dto.SampleDTO;
import org.scoula.ex03.dto.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller // bean 등록 + Controller 명시
@RequestMapping("/sample") // 해당 클래스에 있는 메소드는 해당 url로 매핑하겠다
@Log4j
public class SampleController {
    // localhost:8080/sample/
    @RequestMapping("")
    public void basic(){
        log.info("basic..........");
    }
    // GET과 POST 두 개 다 모두 처리하는 메소드
    // localhost:8080/sample/basic
    @RequestMapping(value = "/sample/basic", method = {RequestMethod.GET, RequestMethod.POST} )
    public void basicGet() {
        log.info("basic Get.............");
    }

//    @RequestMapping + Get 요청을 합친 어노테이션, GET 요청만 처리 가능
    // localhost:8080/sample/basicOnlyGet
    @GetMapping("/basicOnlyGet")
    public void basicGet2() {
        log.info("basic Get only get.............");
}

    // localhost:8080/sample/ex01
    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        // 넣어준 값이 없을 경우 초기값으로 나온다
        log.info("" + dto);

        return "ex01"; // 뷰의 이름 반환
    }

//    @RequestParam은 DTO 객체를 안 쓰고 각각 파라미터를 받아줄 때 사용
    // 필드 두 개 다 제대로 안 넣어주면 예외 발생, 개별 파라미터는 뷰로 전달 불가능
    // localhost:8080/sample/ex02
    @GetMapping("/ex02")
    public String ex02(
            @RequestParam("name") String name,
            @RequestParam("age") int age) {
        log.info("name: " +name);
        log.info("age: " +age);

        return "ex02"; // 뷰의 이름 반환
    }

    // 같은 이름으로 여러 번 전달하는 경우 List나 배열로 받아올 수 있다
    // localhost:8080/sample/ex02List
    // 테스트해보기 : http://localhost:8080/sample/ex02List?ids=111&ids=222&ids=333
    @GetMapping("/ex02List")
    public String ex02List(
            @RequestParam("ids") ArrayList<String> ids) {
        log.info("ids: " +ids);

        return "ex02List"; // 뷰의 이름 반환
    }

    // 테스트해보기 : http://localhost:8080/sample/ex02Bean?list%5B0%5D.name=aaa&list%5B2%5D.name=bbb
    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTO list) {
        log.info("list dtos: " + list);
        return "ex02Bean";
    }
    @GetMapping("/ex03")
    public String ex03(TodoDTO todo) {
        log.info("todo: " + todo);
        return "ex03";
    }
//    테스트해보기 : http://localhost:8080/sample/ex04?name=aaa&age=11&page=9
    // page를 기본 자료형으로 넘기면 로그에는 찍히지만 뷰로는 전달되지 않는다
    // 따라서 @ModelAttribute로 전달해야 한다(request scope 저장)
    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("dto: " + dto);
        log.info("page: " + page);

        return "sample/ex04";
    }
}
