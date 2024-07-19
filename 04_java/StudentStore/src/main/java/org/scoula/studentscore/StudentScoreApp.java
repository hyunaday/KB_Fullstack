package org.scoula.studentscore;

import org.scoula.studentscore.lib.cli.App;
import org.scoula.studentscore.lib.cli.ui.Menu;
import org.scoula.studentscore.lib.cli.ui.MenuItem;
import org.scoula.studentscore.service.StudentScoreService;

public class StudentScoreApp extends App {
    StudentScoreService service = new StudentScoreService();
    @Override
    public void createMenu(Menu menu) {
        menu.add(new MenuItem("학생수", service::initScores));
        menu.add(new MenuItem("점수입력", service::getScores));
        menu.add(new MenuItem("점수리스트", service::printScores));
        menu.add(new MenuItem("분석", service::analize));
    }
    public static void main(String[] args) {
        App app = new StudentScoreApp();
        app.run();
    }
}