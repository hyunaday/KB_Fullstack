package org.scoula.jdbc_ex.domain;

import lombok.AllArgsConstructor;
import lombok.Data;jdbc_ex
import lombok.NoArgsConstructor;

import java.util.Objects;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
// VO : Value Object (테이블의 한 행을 매핑)
public class UserVO {
    // 테이블 내에서 각각의 컬럼명과 동일하다
    private String id;
    private String password;
    private String name;
    private String role;

    public UserVO(String role, String name, String password, String id) {
        this.role = role;
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserVO userVO = (UserVO) o;
        return Objects.equals(id, userVO.id) && Objects.equals(password, userVO.password) && Objects.equals(name, userVO.name) && Objects.equals(role, userVO.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, name, role);
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

