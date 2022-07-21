package Ch13;

public class ContainersExample {
    public static void main(String[] args) {
        Containers<String, String> container1 = new Containers<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        Containers<String, Integer> container2 = new Containers<String, Integer>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
    }
}
