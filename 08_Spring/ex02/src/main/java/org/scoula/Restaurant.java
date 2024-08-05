package org.scoula;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data // 기본 생성자, Getter + Setter
@RequiredArgsConstructor // final이 붙은 필드를 무조건 생성자에 넣겠다
public class Restaurant {
    // Chef가 빈으로 등록되어 있어야 함
//    @Autowired // 외부에서 의존성 주입해서 자동 연결하겠다
    final private Chef chef;
}