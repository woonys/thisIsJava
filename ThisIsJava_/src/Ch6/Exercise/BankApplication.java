package Ch6.Exercise;

import java.util.Scanner;

public class BankApplication {
    private static BankAccount[] bankAccountArray = new BankAccount[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------");
            System.out.println("선택> ");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            }
            if (selectNo == 2) {
                accountList();
            }
            if (selectNo == 3) {
                deposit();
            }
            if (selectNo == 4) {
                withdraw();
            }
            if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌생성
    private static void createAccount() {
        // 작성 위치
        System.out.println("-------");
        System.out.println("계좌 생성");
        System.out.println("-------");

        System.out.println("계좌번호: ");
        String ano = scanner.next();


        System.out.println("계좌주: ");
        String owner = scanner.next();


        System.out.println("초기입금액: ");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(ano, owner, balance);

        for (int i=0; i < bankAccountArray.length; i++) {
            if (bankAccountArray[i] == null) {
                bankAccountArray[i] = bankAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }
    // 계좌 목록 보기
    private static void accountList() {
        // 작성 위치
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");

        for (int i=0; i < bankAccountArray.length; i++) {
            System.out.println(bankAccountArray[i].getAno() + "    " + bankAccountArray[i].getOwner() + "   " + bankAccountArray[i].getBalance());
        }
    }
    // 에금하기
    private static void deposit() {
        // 작성 위치
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");

        System.out.println("계좌번호: ");
        String ano = scanner.next();

        System.out.println("예금액: ");
        int deposit = scanner.nextInt();

        for (int i=0; i < bankAccountArray.length; i++) {
            if (bankAccountArray[i].getAno() == ano) {
                int existBalance = bankAccountArray[i].getBalance();
                bankAccountArray[i].setBalance(existBalance + deposit);
                System.out.println("결과: 예금을 성공했습니다.");
                break;
            }
        }
    }
    private static void withdraw() {
        // 작성위치
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");

        System.out.println("계좌번호: ");
        String ano = scanner.next();

        System.out.println("출금액: ");
        int withdraw = scanner.nextInt();

        for (int i=0; i < bankAccountArray.length; i++) {
            if (bankAccountArray[i].getAno() == ano) {
                int existBalance = bankAccountArray[i].getBalance();
                if (existBalance < withdraw) {
                    System.out.println("예금 한도 초과입니다.");
                    break;
                }
                bankAccountArray[i].setBalance(existBalance - withdraw);
                System.out.println("결과: 출금을 성공했습니다.");
                break;
            }
        }
    }
    // Account 배열에서 ano와 동일한 Account 객체 찾기
//    private static Account findAccount(String ano) {
//        for (int i=0; i < bankAccountArray.length; i++) {
//            if (bankAccountArray[i].getAno() == ano) {
//
//            }
//        }
//    }
}
