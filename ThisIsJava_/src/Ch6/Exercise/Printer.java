package Ch6.Exercise;

public class Printer {
    // 필드 필요 없음 -> 들고 있어야 할 상태가 필요 없으니
    // 생성자도 필요 없음 -> 객체 생성 시 초기화하는 역할인데 여기서는 객체 생성 없이 온리 메소드
    // Only method
    public void println(int x) {
        System.out.println(x);
    }
    public void println(boolean x) {
        System.out.println(x);
    }
    public void println(double x) {
        System.out.println(x);
    }
    public void println(String x) {
        System.out.println(x);
    }

}
