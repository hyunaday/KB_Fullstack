package org.scoula.studentscore.studentscore;

import org.scoula.studentscore.studentscore.service.StudentScoreService;

import java.awt.*;

public class StudentScoreApp extends App{
    StudentScoreService service = new StudentScoreService();

    @Override
    public void createMenu(Menu menu) {
        menu.add(new MenuItem("학생수",  service::initScores));
        menu.add(new MenuItem("점수입력", service::getScores));
        menu.add(new MenuItem("점수리스트",service::printScores));
        menu.add(new MenuItem("분석", service::analize));
    }
    public static void main(String[] args) {
        App app = new StudentScoreApp();
        app.run();
    }
}