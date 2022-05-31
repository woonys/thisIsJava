package Ch8;

public interface RemoteControl {
    // 상수: 고정값
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드: 객체가 갖고 있는 메소드 설명한 것 -> 호출할 때 어떤 매개값이 필요하고 리턴 타입이 무엇인지만 알려줌! 실제 실행부는 객체가 갖고 있다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드: 인터페이스에 선언되지만 사실은 객체가 갖고 있는 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            return;
        }
        System.out.println("무음 해제합니다.");
        return;
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
