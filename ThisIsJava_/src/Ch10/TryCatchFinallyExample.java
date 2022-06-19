package Ch10;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try { // 여기에 예외 발생 가능 코드를 입력
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) { // 예외 클래스 발생시 아래 처리
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
