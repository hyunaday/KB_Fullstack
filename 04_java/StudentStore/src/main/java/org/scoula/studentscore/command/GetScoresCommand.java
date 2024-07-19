package org.scoula.studentscore.command;


import org.scoula.studentscore.lib.cli.command.Command;
import org.scoula.studentscore.lib.cli.ui.Input;
import org.scoula.studentscore.studentscore.domain.StudentScores;

public class GetScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();
    @Override
    public void execute() {
        // 기존에 저장되어있는 학생들의 점수 리스트를 가져옴
        int [] scores = studentScores.getScores();

        // 점수 리스트를 돌면서 사용자한테 입력받은 점수를 넣어줌
        for(int i = 0; i< scores.length; i++) {
            scores[i] = Input.getInt("scores[" + i + "]> ");
        }
    }
}