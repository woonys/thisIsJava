package Ch9;

import Ch9.A.B;
import Ch9.A.C;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        // 인스턴스 멤버 클래스 객체 생성 -> B
        A.B b = a.new B(); // =왼쪽에는 클래스가 오고 오른쪽에는 특정 인스턴스에 대한 멤버 객체가 온다.
        b.field1 = 3;
        b.method1();

        // 정적 멤버 클래스 객체 생성: C
        A.C c = new A.C(); // 위랑 다르네?! 인스턴스 멤버 클래스는 특정 인스턴스에 대한 새로운 멤버 클래스를 선언한다면(b는 a에 종속된다) 얘는 특정 인스턴스에 종속되지 않는 멤버 클래스가 만들어진다.(c는 a에 종속되지 않음.)
        c.field1 = 3; // 인스턴스 필드
        c.method1(); // 인스턴스 메소드
        C.field2 = 3; // 정적 필드
        C.method2(); // 정적 메소드

        a.method(); // 로컬 클래스 객체 D 생성을 위한 메소드 호출

    }
}
