package week1.연속된부분수열의합;


import java.util.HashMap;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int s = 0;
        int e = 1;
        int sum = 0;
        int length = sequence.length;
        int[] result = new int[2];

        HashMap<int[], Integer> map = new HashMap<int[], Integer>(); // sTor 과 length

        while (s < e && e < length) {
            for (int i = s; i < e; i++) {
                sum += sequence[i];
            }
            System.out.println("s = " + s + ", e = " + e);

            if (sum == k) {
                map.put(new int[]{s, e}, (e - s));
                System.out.println("s = " + s + ", e = " + e);

                if (length > (e - s)) {
                    length = (e - s);
                    result[0] = s;
                    result[1] = e;
                }

                s++;
                e++;
            } else {
                e += 1;
            }
        }

        return result;
    }

}
