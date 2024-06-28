package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
//        int num;

        class Num {
            int num;


        }
        Num num = new Num();
        System.out.println(num.num);

        Car myCar = new Car("그랜저", "검정", 250);
        //Car myCar = new Car();
        //새로운 생성자를 만들고 나면 기본 생성자는 호출을 할수 없음
        //Car myCar = new Car();//기본 생성자 호출 못함
//        System.out.println(num);
    }
}
