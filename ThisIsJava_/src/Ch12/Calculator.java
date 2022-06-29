package Ch12;

import Ch9.Person;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // 12.4.2 동기화 메소드 추가 -> synchronized
    public synchronized void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
        this.memory = memory; // 매개값을 memory 필드에 저장
        try {
            Thread.sleep(2000); // 스레드 2초간 일시정지
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}

