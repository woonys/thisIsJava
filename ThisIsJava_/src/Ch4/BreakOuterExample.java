package Ch4;

public class BreakOuterExample {
    /* 반복문이 중첩되어 있을 경우 break 문은 가장 가까운 반복문만 조욜하고 바깥쪽 반복문은 종료시키지 않는다.
    * 중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름을 붙이고 "break 이름;"을 사용하면 된다.*/
    public static void main(String[] args) {
        Outter: for (char upper='A'; upper <= 'Z'; upper++) {
            for (char lower='a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter; // 끝내는 for문은 바깥쪽 for!
                }
            }
        }
    }
}
