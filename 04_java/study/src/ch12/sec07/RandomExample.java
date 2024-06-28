package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.println("선택번호: ");
        for(int i =0; i<6; i++){
//            0~44까지를 랜덤으로 생성한 후 모든 숫자에 1을 더해준다
//            따라서 1~45까지 랜덤숫자가 된다
            selectNumber[i] = random.nextInt(45) +1;
            System.out.print(selectNumber[i]+ " ");
        }
        System.out.println();

        // 당첨번호
        int[] winnigNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨번호: ");
        for(int i =0; i<6; i++){
            winnigNumber[i] = random.nextInt(45) +1;
            System.out.print(winnigNumber[i]+ " ");
        }
        System.out.println();

        // 당첨여부, 비교하기 전에 배열 항목을 정렬
        Arrays.sort(selectNumber); // 해당 배열을 오름차순으로 정렬해준다
        Arrays.sort(winnigNumber);
        // Arrays.equals() : 두개의 배열값이 같은지 비교해준다
        boolean result = Arrays.equals(selectNumber, winnigNumber); // 배열 항목 비교
        System.out.println("당첨여부: ");
        if(result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
