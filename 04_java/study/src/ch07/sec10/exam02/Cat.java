package ch07.sec10.exam02;

// 조치 방법 : 빨간 밑줄에서 'alt + enter'키를 누르면 에러 해결 방법을 제시해준다.
public class Cat extends Animal {
    // 추상 메소드 재정의
@Override
    public void sound() {
    System.out.println("야옹");
}
}
