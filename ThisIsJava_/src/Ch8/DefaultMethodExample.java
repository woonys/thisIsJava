package Ch8;

public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterface mi1 = new MyClassA(); // 구현 객체를 만들되, 사용할 때는 인터페이스를 갖고서 사용한다! 그 뒷단의 구현 객체는 건들지 않는다.
        mi1.method1();
        mi1.method2();

        MyInterface mi2 = new MyClassB();
        mi2.method1();
        mi2.method2();
    }
}
