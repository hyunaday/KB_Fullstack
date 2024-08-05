package org.scoula.ex03.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TodoDTO {
    private String title;

    // 날짜 형식을 해당 포맷으로 지정해줌
    // http://localhost:8080/sample/ex03?title=test&dueDate=2023/01/01
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dueDate;
}
