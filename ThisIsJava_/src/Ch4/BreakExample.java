package Ch4;

public class BreakExample {
    // Break문: 반복문 실행 중지할 때 사용.
    public static void main(String[] args) {
        while (true) {
            int num = (int)(Math.random()*6) + 1; // 타입 캐스팅 & 난수 생성(1~6)
            System.out.println(num);
            if (num == 6) { // 주사위 굴려서 6 나오면 종료
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
