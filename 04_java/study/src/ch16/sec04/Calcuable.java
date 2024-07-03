package ch16.sec04;

@FunctionalInterface
// 함수형 인터페이스의 추상 메소드는 반드시 하나여야 한다.
public interface Calcuable {
    double calc(double x, double y);
}
