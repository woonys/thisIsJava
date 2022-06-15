package Ch9;

import Ch9.A.B;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button(); // btn 객체 생성

        btn.setOnClickListener(new CallListener()); // btn의 OnClickListener 인터페이스에 대해 setter 메소드로 CallListener() 구현 객체로 설정
        btn.touch();

        btn.setOnClickListener(new MessageListener()); // btn의 OnClickListener 인터페이스에 대해 setter 메소드로 MessageListener() 구현 객체로 설정
        btn.touch();
    }
}
