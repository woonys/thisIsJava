package Ch6;

public class Car {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    private int speed;
    private boolean stop;

    // 생성자
    Car() {
        // 생성자 1
    }

    Car(String model) {  // 생성자 2
        this.model = model;
    } // 생성자 2

    Car(String model, String color) {  // 생성자 3
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {  // 생성자 4
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        }

        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.speed = 0;
    }
}
