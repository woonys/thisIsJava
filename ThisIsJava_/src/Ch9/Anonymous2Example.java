package Ch9;

public class Anonymous2Example {
    public static void main(String[] args) {
        Anonymous2 anony = new Anonymous2();
        // 익명 객체 필드 사용
        anony.field.turnOn(); // 필드값: TV를 켭니다.
        // 익명 객체 로컬 변수 사용
        anony.method1(); // 메소드 내 로컬 변수 초기값: Audio를 켭니다.
        // 익명 객체 매개값 사용
        anony.method2(
            new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("Smart TV를 켭니다.");
                }

                @Override
                public void turnOff() {
                    System.out.println("Smart TV를 끕니다.");
                }
            }
        );
    }
}
