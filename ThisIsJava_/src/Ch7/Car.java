package Ch7;

public class Car {
    // 필드 -> 자동차는 4개의 타이어를 가진다.
    Tire[] tires = {
        new Tire("앞왼쪽", 6),
        new Tire("앞오른쪽", 2),
        new Tire("뒤왼쪽", 3),
        new Tire("뒤오른쪽", 4)
    };

    // 생성자

    // 메소드 -> 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메소드를 호출한다. false를 리턴하는 roll()이 있을 경우 stop() 메소드를 호출하고 해당 타이어 번호를 리턴.
    int run() {
        System.out.println("[자동차가 달립니다.]");
        for (int i = 0; i < tires.length; i++) {
            if(tires[i].roll() == false) {
                stop();
                return (i+1);
            }
        }
        return 0;
    }

    void stop() { // 펑크 났을 때 실행
        System.out.println("[자동차가 멈춥니다.]");
    }

}
