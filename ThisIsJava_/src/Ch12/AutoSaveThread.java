package Ch12;

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용 저장함.");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save(); // 1초 주기로 save() 메소드 자동 호출
        }
    }
}
