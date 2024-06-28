package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
//sex가 1이나 3인 경우
//                case '1'에  break문이 없으므로 아래 조건에 같이 포함된다
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
//                sex가 '2'나 '4'인 경우
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
