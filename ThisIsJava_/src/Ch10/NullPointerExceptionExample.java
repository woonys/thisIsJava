package Ch10;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null; // data 변수는 null 값을 갖고 있기에 String 객체를 참조하지 않는다.
        System.out.println(data.toString()); // 근데 여기서는 String 객체의 toString() 메소드를 호출하니 NullPointerException 발생.
    }
}
