package Ch9;

public class Outter {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested { // 인스턴스 멤버 클래스 생성
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            // 중첩 객체 참조
            System.out.println(this.field);
            this.method();
            // 바깥 객체 참조
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }
}
