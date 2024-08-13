package org.scoula.board.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller // controller 기능을 하는 빈 등록
@Log4j
@RequiredArgsConstructor // 생성자 주입
@RequestMapping("/board") // url 공통주소 할당
public class BoardController {
    final private BoardService service;

    // https://localhost:8080/board/list
    // return 값이 void이기 때문에 뷰도 경로가 동일 (board/list)
    @GetMapping("/list")
        public void list(Model model) {
            log.info("list");
    // Model의 속성에 데이터를 담을 경우 뷰로 전달 가능
    model.addAttribute("list", service.getList());
    }

    @GetMapping("/create")
    public void create(){
        log.info("create");
    }

    @PostMapping("/create")
    public String create(BoardDTO board, RedirectAttributes ra) {
//        log.info("create: " + board);
//        // service -> mapper.java -> mapper.xml
//        service.create(board);
        service.create(board);
        ra.addFlashAttribute("result", board.getNo());
        log.info("create: " + board);
        // 게시물 목록 페이지로 리다이렉트
        return "redirect:/board/list";
    }

    // 2024-08-12 추가
    @GetMapping({ "/get", "/update" }) // "/get"과 "/update" 경로를 둘 다 처리
//    @RequestParam : 주소 뒤에 ?를 붙여서 쿼리스트링으로 정보를 받아준다
    public void get(@RequestParam("no") Long no, Model model) {

        log.info("/get or update");
        // Model 객체는 데이터를 뷰로 전달하기 위해 사용
        model.addAttribute("board", service.get(no));
    }

    @PostMapping("/update")
//    public String update(BoardDTO board) {
//        log.info("update:" + board);
//        service.update(board);
    public String update(BoardDTO board,
                         RedirectAttributes ra) {
        if (service.update(board)) {
            ra.addFlashAttribute("result", "success");
            log.info("update:" + board);
        }
        // 수정한 후 목록 페이지로 리다이렉트
        return "redirect:/board/list";
    }

//    @GetMapping("/delete")
//    public String delete(@RequestParam("no") Long no) {
//        log.info("delete: " + no);
//        service.delete(no);
//
//        return "redirect:/board/list";
//    }

    @PostMapping("/delete")
    public String delete(@RequestParam("no") Long no,
                         RedirectAttributes ra) {
//        log.info("delete..." + no);
//        service.delete(no);

        if (service.delete(no)) {
            ra.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }

}
