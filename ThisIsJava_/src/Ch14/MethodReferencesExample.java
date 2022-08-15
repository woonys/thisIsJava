package Ch14;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y); // 여기서는 불필요하게 굳이 굳이 매개 변수 다 적어야 한다.
        System.out.println("결과 1: " + operator.applyAsInt(1, 2));

        operator = Calculator :: staticMethod; // 위와 동일 -> & 불필요한 매개 변수 제거 가능!
        System.out.println("결과 2: " + operator.applyAsInt(3, 4));

        //인스턴스 메소드 참조
        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과 3: " + operator.applyAsInt(5, 6));

        operator = obj :: instanceMethod;
        System.out.println("결과 4: " + operator.applyAsInt(7, 8));
    }
}
