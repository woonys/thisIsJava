package Ch7;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child; // parent 인스턴스에 child 인스턴스 대입 -> 자동 타입 변환!
        parent.method1();
        parent.method2(); // 자식 클래스에서 오버라이드로 재정의된 메소드가 호출된다
        // parent.method3(); => 호출 불가능!
    }
}
