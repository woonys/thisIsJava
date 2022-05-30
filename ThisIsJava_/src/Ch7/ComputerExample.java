package Ch7;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator(); // 부모 클래스
        System.out.println("원면적: " + calculator.areaCircle(r)); // 부모 클래스에서 정의된 메소드 호출(3.14159)
        System.out.println();

        Computer computer = new Computer(); // 자식 클래스
        System.out.println("원면적 : " + computer.areaCircle(r)); // 자식 클래스에서 오버라이드로 재정의된 메소드 호출(Math.PI)
    }
}
