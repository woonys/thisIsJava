package Ch8;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                //실행문
            }

            @Override
            public void turnOff() {
                //실행문
            }

            @Override
            public void setVolume(int volume) {
                //실행문
            }
        }; // RemoteControl 인터페이스 타입 변수를 선언
    }
}
