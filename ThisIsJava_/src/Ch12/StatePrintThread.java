package Ch12;

import java.lang.Thread.State;

public class StatePrintThread { // 타겟 스레드 상태 출력하는 메소드
    private Thread targetThread;

    // 생성자
    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    public void run() {
        while (true) {
            Thread.State state = targetThread.getState(); // 스레드 상태 얻기
            System.out.println("타겟 스레드 상태: " + state);

            // 객체 생성 상태일 경우 실행 대기 상태로 만든다.
            if(state == State.NEW) {
                targetThread.start();
            }
            // 종료 상태일 경우 while문을 종료한다.
            if(state == State.TERMINATED) {
                break;
            }
            try {
                // 0.5초간 일시 정지
                Thread.sleep(500);
            } catch (Exception e) {}
         }
    }
}
