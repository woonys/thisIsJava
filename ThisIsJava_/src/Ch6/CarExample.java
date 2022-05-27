package Ch6;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car(); // 생성자 선택
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car car4 = new Car("택시","검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car3.model : " + car4.model);
        System.out.println("car3.color : " + car4.color);
        System.out.println("car3.maxSpeed : " + car4.maxSpeed);
        System.out.println();

        Car myCar = new Car();

        // 잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도: " + myCar.getSpeed());

        // 올바른 속도 변경
        myCar.setSpeed(60);

        System.out.println("현재 속도: " + myCar.getSpeed());

        // 멈춤
        if(!myCar.isStop()) {
            myCar.setStop(true);
            System.out.println("멈췄습니다");
        }

        System.out.println("현재 속도: " + myCar.getSpeed());
    }
}
