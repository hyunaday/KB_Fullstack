package org.scoula.studentscore.service;

import org.scoula.studentscore.domain.StudentScores;
import org.scoula.studentscore.lib.cli.ui.Input;

public class StudentScoreService {
    private final StudentScores studentScores;

    public StudentScoreService() {
        this.studentScores = StudentScores.getInstance();
    }

    public void initScores() {
        int studentNum = Input.getInt("학생수> ");
        studentScores.setStudentNum(studentNum);
    }

    public void getScores() {
        int[] scores = studentScores.getScores();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }

    public void printScores() {
        int[] scores = studentScores.getScores();
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }

    public void analyze() {
        int[] scores = studentScores.getScores();
        if (scores.length == 0) {
            System.out.println("점수가 초기화되지 않았습니다.");
            return;
        }

        int max = scores[0];
        int sum = 0;
        double avg;

        for (int score : scores) {
            max = Math.max(max, score);
            sum += score;
        }

        avg = (double) sum / studentScores.getStudentNum();

        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }
}
