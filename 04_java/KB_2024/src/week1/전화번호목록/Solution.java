package week1.전화번호목록;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        //✅ phone_book 정렬한다.
        Arrays.sort(phone_book);

        //✅ i를 0 ~ phone_book.length - 2까지 순회한다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            //✅ phone_book[i+1]이 phone_book[i]로 시작한다면 false를 반환한다.
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
//        가장 중요한 건 내가 자지 않고 수업에 집중하는 것

        //✅ 접두어를 찾지 못했다면 true를 반환한다.
        return true;
    }
}