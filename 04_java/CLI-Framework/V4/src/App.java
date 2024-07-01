public class App {
    Menu menu;

    public App() {
        };
    }

    public void init(int menuSize) {
        menu = new Menu(menuSize);
        createMenu(menu);
    }

    public void createMenu(Menu menu) {
        menu.add(0, new MenuItem("학생수", new InitScoresCommand()));
        menu.add(1, new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(2, new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(3, new MenuItem("분석", new AnalizeCommand()));
        menu.add(4, new MenuItem("종료", new ExitCommand()));
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
    public void executeCommand(int selectNo) {
       Command command = commands[selectNo-1];
       command.execute();
    }

    public void run() {
    init(5);
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