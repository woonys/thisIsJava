package Ch12;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start(); // 데몬 스레드 실행 -> 아래에서 주 스레드 종료와 함께 데몬 스레드 종료

        try {
            Thread.sleep(3000); // 3초 뒤에 주 스레드 종료
        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");
    }
}
