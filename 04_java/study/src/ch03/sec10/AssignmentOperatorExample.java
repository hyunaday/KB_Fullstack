package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        result +=10;
        System.out.printf("result=" + result);
        result -= 5;
        System.out.printf("result=" + result);
        result += 3;
        System.out.printf("result=" + result);
        result /= 5;
        System.out.printf("result=" + result);
        result %= 3;
        System.out.printf("result=" + result);

    }
}
