package Ch14;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> { // int값을 리턴
            int num = (int) (Math.random() * 6) +1;
            return num;
        };

        int num = intSupplier.getAsInt(); // supplier 함수 인터페이스 특징: 매개 변수 없고 리턴값이 있는 getXXX() 메소드를 갖는다. 이 메소드들은 실행 후 호출한 곳으로 데이터를 리턴한다.
        System.out.println("눈의 수 " + num);
    }
}
