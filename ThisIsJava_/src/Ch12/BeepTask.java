package Ch12;

import java.awt.Toolkit;

import javax.tools.Tool;
// 비프음 들려주는 작업 정의
public class BeepTask implements Runnable {
    public void run() { // 스레드 실행 내용
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}