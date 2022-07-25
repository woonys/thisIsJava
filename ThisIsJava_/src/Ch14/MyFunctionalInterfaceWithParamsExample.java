package Ch14;

public class MyFunctionalInterfaceWithParamsExample {
    public static void main(String[] args) {
        MyFunctionalInterfaceWithParams fi;

        fi = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        fi = (x) -> {
            System.out.println(x*5);
        };
        fi.method(2);
        fi = x -> System.out.println(x * 5); // 매개 변수가 하나일 경우 괄호 생략 가능!
        fi.method(2);
    }
}
