package week1.예산;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int limit = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            limit += d[i];
            if(limit <= budget){
                answer ++;
            }
        }
        return answer;
    }
}
