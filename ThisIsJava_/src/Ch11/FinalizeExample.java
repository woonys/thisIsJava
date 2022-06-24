package Ch11;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;
        for (int i=1; i <= 50; i++) {
            counter = new Counter(i);

            counter = null; // Counter 객체를 쓰레기로 만든다.

            System.gc(); // 가비지 콜렉터 실행 요청
        }
    }
}
