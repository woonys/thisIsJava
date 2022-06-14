package Ch8;

public interface ChildInterface1 extends ParentInterface {
    public void method3();
}

// 이 경우 ChildInterface1을 구현하는 클래스는 ParentInterface가 원래 갖고 있던 method1에 대한 실체 메소드를 갖고 있어야 한다. method2는 디폴트 메소드이기 때문에 바로 호출 가능!
