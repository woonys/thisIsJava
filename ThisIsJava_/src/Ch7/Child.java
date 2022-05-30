package Ch7;

public class Child extends Parent{
    @Override
    public void method2() {
        System.out.println("Child-method2()"); // 부모 메소드 재정의
    }
    public void method3() {
        System.out.println("Child-method3()");
    }

}
