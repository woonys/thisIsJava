package Ch9;

public class Button {
    OnClickListener listener; // 인터페이스 타입 필드

    void setOnClickListener(OnClickListener listener) { // setter 메소드: 구현 객체를 인자로 받은 다음 아래와 같이 버튼의 리스너로 set한다.
        this.listener = listener; // 매개변수 다형성: 인자로 받은 listener를 this(button 클래스)의 listener로 바꾼다!
    }
    void touch() {
        listener.onClick(); // 구현 객체의 onClick() 메소드를 호출
    }

    interface OnClickListener {
        void onClick(); // 중첩 인터페이스
    }
}
