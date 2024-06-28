import java.util.Scanner;

public class App {
          boolean run = true;
          int studentNum = 0;
//        scores는 정수 배열
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

//        printMenu : 메뉴 출력하는 메소드
        public void printMenu() {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
        }

//        getSelect  사용자가 입력한 메뉴번호 리턴
        public int getSelect () {
            System.out.println("선택> ");
            return Integer.parseInt(scanner.nextLine());
        }
        // analize : 4번 메뉴인 분석 기능 처리하는 메소드
        private void analize() {
            int max = 0;
            int sum = 0;
            double avg = 0;
            for (int i = 0; i < scores.length; i++) {
                max = (max < scores[i]) ? scores[i] : max;
                sum += scores[i];
            }
            avg = sum / studentNum;
            System.out.println("최고 점수: " + max);
            System.out.println("평균 점수: " + avg);
        }
        public void getStudentNum(){
            System.out.println("학생수> ");
            studentNum = Integer.parseInt(scanner.nextLine());
            scores = new int[studentNum];
        }
        public void getScores() {
            for(int i = 0; i < scores.length; i++){
                System.out.println("scores[" + i + "]> ");
                scores[i] = Integer.parseInt(scanner.nextLine());            }
        }
    public void printScores() {
        for(int i=0; i<scores.length; i++){
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
    public void exit() {
        run = false;
    }
    public void executeCommand
            (int selectNo) {
        if(selectNo == 1) {
            getStudentNum();
        } else if(selectNo == 2) {
            getScores();
        } else if(selectNo == 3) {
            printScores();
        } else if(selectNo == 4) {
            analize();
        } else if(selectNo == 5) {
            exit();
        }
    }

    public void run() {
        while(run) {
            printMenu();
            int selectNo = getSelect();
            executeCommand
                    (selectNo);
        }
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}