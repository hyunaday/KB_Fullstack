public class Menu {
    String menus [] = {"학생수", "점수입력", "점수리스트", "분석", "종료"};

    public void printMenu(){
        System.out.println("------------------------------------");
        for(int i = 0; i < menus.length; i++){
            System.out.printf("%d.%s | ", i+1, menus[i]);
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    public int getSelect() {
        // 사용자가 입력한 숫자를 받아서 selectNo에 저장
        int selectNo = Input.getInt("선택> "); // 'Input' class의 static 메소드 'getInt'
        // 올바른 범위인지 체크

        return selectNo;
    }
}

