package Ch14;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;
        // 람다식에서 매개 변수가 없는 이유: Interface fi의 메소드 method()가 매개변수를 갖지 않기 때문
        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> System.out.println("method call3"); // 실행문 하나면 중괄호 생략 가능
        fi.method();
    }
}
