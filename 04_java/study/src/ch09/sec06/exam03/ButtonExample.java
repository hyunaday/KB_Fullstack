package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        // main 메소드 내에 위치한 클래스
        // *로컬 클래스 : 생성자 혹은 (main)메소드 안에 있다면 로컬 클래스이다.
        class OkListener implements Button.ClickListener {
            // ClickListener의 onClick 메소드를 오버라이딩
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());
        // OkListener는 ClickListener를 상속받았기 때문에 ClickListener 타입으로 주입 가능 (업캐스팅)

        // 오버라이딩한 메소드를 호출하므로 OkListener의 onClick 호출
        // Ok 버튼 클릭하기
        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        // Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());

        // Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
