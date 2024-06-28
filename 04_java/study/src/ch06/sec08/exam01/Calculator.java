package ch06.sec08.exam01;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    // 호출 시 두 정수값을 전달받고 호출한 곳으로 결과값 int 리턴
    // 두 정수값 : int x와 int y
    int plus(int x, int y) {
        int result = x+y;
        return result;
    }
    // 호출 시 두 정수값을 전달받고 호출한 곳으로 결과값 double 리턴
    double divide(int x, int y) {
        double result = (double)x+(double)y;
        return result;
    }
}
