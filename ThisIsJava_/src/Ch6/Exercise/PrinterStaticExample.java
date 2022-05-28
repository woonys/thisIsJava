package Ch6.Exercise;

public class PrinterStaticExample {
    public static void main(String[] args) {
        // 정적 메소드 선언 -> new 연산자로 객체 생성할 필요 X
        PrinterStatic.println(10);
        PrinterStatic.println(true);
        PrinterStatic.println(5.7);
        PrinterStatic.println("홍길동");
    }
}
