package Ch9;

public class CallListener implements Button.OnClickListener { // 중첩 인터페이스에 대한 구현 객체

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}