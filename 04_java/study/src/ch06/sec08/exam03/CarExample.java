package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
//        Car 객체 생성
        Car myCar = new Car();

//        리턴값이 없는 setGas() 메소드 호출
//                myCar의 gas를 5로 변경
        myCar.setGas(5);

//        isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
//                현재 가스 값이 5이므로 isLeftGas 내에서 true를 반환
        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");
            // gas가 0이 될때까지
            myCar.run();
        }
        // 마지막에는 gas가 0인 상태
        System.out.println("gas를 주입하세요.");
    }
}
