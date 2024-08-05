package org.scoula.ex03.controller;

import org.scoula.ex03.dto.SampleDTO;
import org.scoula.ex03.dto.SampleDTOList;
import org.scoula.ex03.dto.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sample")
@Log4j

public class SampleController {
    @RequestMapping("") // url : /sample
    @GetMapping("/ex03")
    public String ex03(TodoDTO todo){
        log.info("todo:: " + todo);
        return "ex03";
//        log.info("basic..........");
    }


    @GetMapping("/ex04")
    public String ex02Bean(SampleDTO dto, int page) {
        log.info("dto: " + dto);
        log.info("page: " + page);
//        log.info("list dtos: " + list);

        return "sample/ex04";
        // ========
//            @RequestParam("name") String name,
//                           @RequestParam("age") int age) {
//        log.info("name:" + name);
//        log.info("age:" + age);
//
//        return "ex02";
    }
}
