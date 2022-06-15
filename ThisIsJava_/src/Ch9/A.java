package Ch9;

import java.sql.SQLOutput;

public class A {
    A() {System.out.println("A 객체가 생성됨.");}

    // 인스턴스 멤버 클래스
    class B {
        B() {System.out.println("B 객체가 생성됨.");} // 생성자

        int field1;

        //static int field2; -> 중첩 클래스 안에 있는 인스턴스 멤버 클래스는 정적 메소드/필드를 선언할 수 없다!
        void method1() {}
        //static void method2() {} -> 마찬가지로 정적 메소드 선언 불가
    }

    // 정적 멤버 클래스 -> 인스턴스 멤버 클래스와 달리 인스턴스 메소드/필드 & 정적 메소드/필드 모두 선언 가능
    static class C {
        C() {System.out.println("C 객체가 생성됨.");}

        int field1; // 인스턴스 필드
        static int field2; // 정적 필드
        void method1() {}
        static void method2() {}
    }

    // 로컬 클래스 -> 메소드 안에서 선언되며 접근 제한자 붙일 수 없음. 어차피 메소드 안에서만 호출될 수 있음.
    void method() {
        class D {
            D() {System.out.println("D 객체가 생성됨.");}

            int field1;

            //static int field2; -> 로컬 클래스에서도 정적 필드 사용 불가
            void method1() {} // 메소드는 선언 가능
            //static void method2() {}  -> 정적 메소드는 선언 불가
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}