package ch06.sec07.exam02;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    // this가 붙은 name은 해당 클래스의 필드를 의미하고
    //그냥 name은 받아온 파라미터 값을 의미한다
    public Korean(String n, String s) {
        name=n;
        ssn=s;
    }
}
