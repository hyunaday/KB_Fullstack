package org.scoula.ex03.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SampleDTOList {
    private List<SampleDTO> list;

    public SampleDTOList() {  // 메서드
        list = new ArrayList<>(); // 생성자
    }
}
