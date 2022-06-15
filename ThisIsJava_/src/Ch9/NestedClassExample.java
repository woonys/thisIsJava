package Ch9;

import Ch9.A.C;
import Ch9.Car.Engine;

public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire(); // 인스턴스 멤버 클래스는 인스턴스 myCar에 종속
        Car.Engine engine = new Car.Engine();
    }
}

