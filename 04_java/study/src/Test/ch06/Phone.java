package Test.ch06;

// Phone이라는 이름의 class를 생성한다.
public class Phone {
    // 필드 선언
    // 접근제어자+타입+변수명;
    public String model;
    public String color;

    // 메소드 선언
    // 접근제어자+데이터타입+메서드명()
    // void : 리턴값이 없음을 나타낸다. 즉 메서드가 어떤 작업을 수행하긴 하지만 그 결과값을 반환하지 않고 print문을 화면에 출력만 한다.
    // 리턴값이 있는 경우 : return 문으로 종료시켜줘야 한다.
    // "벨이 울립니다" bell() 메소드 출력
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    //  sendVoice() : '자기: String message' 메서드 입력받기
    // 메서드 값을 받아오려면 매개변수가 있어야 함
    // 매개변수 : 값을 주고받는 변수, message를 String 타입으로 받아옴
    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    //  receiveVoice() : '상대방: String message' 메서드 입력받기
    public void receiveVoice(String message){
    System.out.println("상대방: " + message);
}
    // "전화를 끊습니다." hangUp() 메소드 출력
    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
