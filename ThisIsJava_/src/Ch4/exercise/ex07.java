package Ch4.exercise;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        while (run) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.println("선택> ");

            int inputNum = scanner.nextInt();
            switch (inputNum) {
                case 1:
                    System.out.println("예금액> ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;
                case 2:
                    //Refactoring code: using return early pattern
                    System.out.println("출금액> ");
                    int withdraw = scanner.nextInt();
                    if (balance - withdraw < 0) {
                        System.out.println("잔액이 부족해 출금할 수 없습니다.");
                        break;
                    }

                    balance -= withdraw;
                    System.out.println("출금을 완료했습니다.");
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
            }
        }
    }
}
