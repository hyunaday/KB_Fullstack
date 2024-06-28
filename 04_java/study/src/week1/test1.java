package week1;
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 1. 두 배열을 정렬한다.(nlogn)
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때까지 찾는다.
        // i 0~ n-1 순회(0(n))
        for(int i=0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        // 3. 완주하지 못한 마지막 주자
        return participant[participant.length-1];


    }
}
