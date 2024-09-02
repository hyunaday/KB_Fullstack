package org.scoula.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;


@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequestBody
public class ChangePasswordDTO {
    String username; // 사용자 ID
    String oldPassword; // 이전 비밀번호
    String newPassword; // 새 비밀번호
}