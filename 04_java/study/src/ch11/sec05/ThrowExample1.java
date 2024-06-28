package ch11.sec05;

public class ThrowExample1 {
    public static void main(String[] args) {
        try{
            findClass();
        } catch(ClassNotFoundException e) {
//             try문에서 던진 예외를 받아와서 처리해줌
            System.out.println("예외 처리: " + e.toString());
        }
    }
    // throw 키워드를 이용해서 메소드를 호출한 곳으로 예외를 던진다
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
