package week1.test2;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int counter = 0;
 //안녕 2024.06.28
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) counter++;
                }
            }
        }
        return counter;
    }
}
