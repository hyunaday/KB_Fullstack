package week2.올바른괄호;

import java.util.*;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // stack보다 deque 사용하기(시간복잡도에 유리)
        Deque<Character> stack = new ArrayDeque<>();
        // for 반복문을 돌려서 문자 하나하나에 접근한다.
        // 열린 괄호면~
        // 스택에 넣어준다.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
        // 닫힌 괄호면~
        // 스택 팝()
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}
