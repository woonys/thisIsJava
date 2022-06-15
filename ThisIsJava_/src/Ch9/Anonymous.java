package Ch9;

public class Anonymous {
    // 필드 초기값으로 대입
    Person field = new Person() { // 필드 선언

        // 초기값 대입
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    }; // -> 익명 객체는 하나의 실행문! 반드시 끝에 세미콜론 붙여야.

    void method1() {
        // 로컬 변수값으로 대입
        Person localVar = new Person() { // 로컬 변수 선언 & 초기값 대입
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        // 로컬 변수 사용
        localVar.wake();
    }
    void method2(Person person) {
        person.wake();
    }
}
