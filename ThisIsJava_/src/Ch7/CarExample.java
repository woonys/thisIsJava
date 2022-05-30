package Ch7;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car(); // Car 객체 생성

        for (int i=1; i<=10; i++) {
            int problemLocation = car.run(); // car 객체의 run() 메소드 5번 반복 실행

            if (problemLocation != 0) { // 문제와는 관련없지만 이렇게 switch문으로 작성 시 동시성 문제 발생 -> 동시에 2개 이상 타이어에 펑크나면 어떻게 처리할래?
                System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
                car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
            }
            System.out.println("------------------------------"); // 1회전 시 출력되는 내용을 구분
        }

    }
}
