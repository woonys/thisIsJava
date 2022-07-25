package Ch14;

import static java.lang.Integer.parseUnsignedInt;
import static java.lang.Integer.sum;

public class MyFunctionalInterfaceWithReturnsExample {
    public static void main(String[] args) {
        MyFunctionalInterfaceWithReturns fi;

        fi = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> x + y; // return 문만 있을 경우 중괄호 {} 와 return 문 생략 가능
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2, 5));
    }
    public static int sum(int x, int y) {
        return (x + y);
    }
}
