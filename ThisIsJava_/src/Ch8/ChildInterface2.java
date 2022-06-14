package Ch8;

public interface ChildInterface2 extends ParentInterface { // ParentInterface를 상속하고
    @Override
    default void method2() { // ParentInterface의 디폴트 메소드인 method2()를 재정의한다.
        ParentInterface.super.method2();
    }

    void method3(); // 자기 자신의 추상 메소드인 method3()을 선언
    // 이 경우도 ChildInterface2 인터페이스를 구현하는 클래스는 method1()과 method3()의 실체 메소드를 갖고 있어야 하며 ChildInterface2에서 재정의한 method2()를 호출할 수 있다.
}
