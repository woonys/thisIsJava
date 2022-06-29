package Ch12;


public class MainThreadExample { // Calculator -> synchronized 메소드 추가! 동기화로 작동.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1(); // User1 스레드 생성
        user1.setCalculator(calculator); // 공유 객체 설정
        user1.start(); // User1 스레드 시작

        // Calculator 클래스에 synchronized 메소드 추가 -> 이제는 user1 작업 끝나야 user2 실행 가능! 이전에는 비동기.
        User2 user2 = new User2(); // User2 스레드 생성
        user2.setCalculator(calculator); // 공유 객체 설정
        user2.start(); // User2 스레드 시작
    }
}
