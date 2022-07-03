package Ch13;

public class BoxExample {
    public static void main(String[] args) {
        /* 제네릭 쓰지 않았을 때
        Box box = new Box();
        box.set("홍길동"); // input 파라미터인 String -> Object로 자동 타입 변환
        String name = (String) box.get(); // Object -> String으로 강제 타입 변환

        box.set(new Apple()); // Apple -> Object로 자동 타입 변환
        Apple apple = (Apple) box.get(); // Object -> Apple로 강제 타입 변환
         */
        // 제네릭 사용 시
        Box<String> box1 = new Box<String>();
        box1.set("hello"); // 자동 타입 변환
        String str = box1.get(); // 위와 달리 강제 타입 변환 필요 없음
        System.out.println("str is: " + str);

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
        System.out.println("value is: " + value);
    }
}
