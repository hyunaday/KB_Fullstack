package week2.두큐합같게만들기;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        boolean q1Toq2 = false;

        long q1Sum = 0;
        long q2Sum = 0;

        //큐 초기화
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q1Sum += queue1[i];
            q2.add(queue2[i]);
            q2Sum += queue2[i];
        }

        // if((q1Sum + q2Sum) % 2 == 1){
        //     return -1;
        // }

        for (int i = 0; i < queue1.length * 4; i++) {

            if (q1Sum == q2Sum) {
                return answer;
            }

            if (q1Sum < q2Sum) {
                answer++;
                int temp = q2.remove();
                q1Sum += temp;
                q2Sum -= temp;
                q1.add(temp);
            } else if (q1Sum > q2Sum) {
                answer++;

                int temp = q1.remove();
                q2Sum += temp;
                q1Sum -= temp;
                q2.add(temp);
            }
        }

        return -1;
    }
}