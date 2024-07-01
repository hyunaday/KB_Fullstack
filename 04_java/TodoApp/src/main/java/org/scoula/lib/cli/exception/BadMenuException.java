package org.scoula.lib.cli.exception;

public class BadMenuException extends Exception {
    public BadMenuException() {
        super("잘못된 메뉴 선택입니다.");
    }
    public BadMenuException(final String message) {
        super(message);  // 부모 생성자 호출
    }
}
