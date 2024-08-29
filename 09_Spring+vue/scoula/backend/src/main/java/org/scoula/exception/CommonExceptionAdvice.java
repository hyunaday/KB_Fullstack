package org.scoula.exception;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
@Slf4j

public class CommonExceptionAdvice {
    // NoHandlerFoundException 예외를 처리해주겠다
    @ExceptionHandler(NoHandlerFoundException.class)
    // 404에러 발생 시 , "/resources/index.html" 페이지로 리다이렉트
    public String handle404(NoHandlerFoundException ex) {
        return "/resources/index.html";
    }
}