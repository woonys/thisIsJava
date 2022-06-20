package Ch10;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) { // findClass() 메소드가 예외처리 떠넘긴 걸 여기서 받아서 처리
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException { // 원래는 findClass() 메소드 내부에서 예외를 처리해야 하나 이걸 위의 try-catch로 떠넘긴다(throws)
        Class clazz = Class.forName("java.lang.String2");
    }
}
