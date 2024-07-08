package ch18.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    // java.lang 패키지 : 자바 언어의 기본 클래스를 제공한다.
    @Override
    public String toString() { return id + ": " + name; }
}

