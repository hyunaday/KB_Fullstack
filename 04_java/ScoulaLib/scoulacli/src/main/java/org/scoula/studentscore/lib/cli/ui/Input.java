package org.scoula.studentscore.lib.cli.ui;

import java.util.Scanner;

public class Input {
//    Scanner 객체는 하나만 있어도 되기 때문에 static으로 생성
    static Scanner scanner = new Scanner(System.in);

//    사용자한테 입력받을 때 출력할 문구를 title로 받아옴
    public static int getInt(String title) {
        System.out.print(title);
        return Integer.parseInt(scanner.nextLine());
    }

    // 사용자한테 String을 입력받을 용도의 메소드
    public static String getLine(String title) {
        System.out.print(title);
        return scanner.nextLine();
    }

    // 기본값을 넣어주기 위한 메소드 오버로딩
    public static String getLine(String title, String defaultValue) {
        // 이름(김길동):
        System.out.printf("%s($s): ", title, defaultValue);
        String answer = scanner.nextLine();

        // answer 값이 비어있으면 defaultValue 리턴, 비어있지 않으면 answer 그대로 리턴
        return answer.isEmpty() ? defaultValue : answer;
    }
    // 메소드 오버로딩을 통해 값을 넘김
    public static boolean confirm(String title){
        return confirm(title, true);
    }
    public static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ", title, yesNo);

        String answer = scanner.nextLine();
        if(answer.isEmpty())
            return defaultValue;

        // answer가 비어있지 않은 경우 answer와 "y"가 같은지 비교함
        // IgnoreCase : 해당 문자가 대문자들 소문자든 상관없음
        return answer.equalsIgnoreCase("y");
    }

}
