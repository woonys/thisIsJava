package Ch11;

import java.util.Arrays;

public class MemberDeepClone implements Cloneable {
    public String name;
    public int age;
    // 참조 타입 필드 -> 깊은 복제 대상
    public int[] scores;
    public Car car;

    public MemberDeepClone(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    // clone() 메소드 재정의
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 먼저 얕은 복사 해서 name, age 복제
        MemberDeepClone cloned = (MemberDeepClone) super.clone();
        // scores를 깊은 복제 하기
        cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
        // car를 깊은 복제
        cloned.car = new Car(this.car.model);
        // 깊은 복제된 Member 객체를 리턴
        return cloned;
    }

    public MemberDeepClone getMember() {
        MemberDeepClone cloned = null;
        try {
            cloned = (MemberDeepClone) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
}
