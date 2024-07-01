public class App {
    int studentNum = 0;
    int[] scores = null;

    Menu menu;

    public App() {
        menu = new Menu();
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
        while(true) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}