import command.*;
import ui.Menu;
import ui.MenuItem;

// 커스터마이징하는 부분만 App 클래스에서 추출하여 자식 클래스 생성
public class MyApp extends App {
    @Override
    public void createMenu(Menu menu) {
        // App의 createMenu 호출
        super.createMenu(menu);

        // MenuItem 배열의 해당 인덱스에 메뉴 이름과 Command를 묶어서 추가해준다
        menu.add(new MenuItem("학생수", new InitScoresCommand()));
        menu.add(new MenuItem("점수입력", new GetScoresCommand()));
        menu.add(new MenuItem("점수리스트", new PrintScoreCommand()));
        menu.add(new MenuItem("분석", new AnalizeCommand()));
    }
    public static void main(String[] args) {
        App app = new MyApp();
        app.run();
    }
}
