//package Neal;
//
//import java.util.Map;
//import java.util.Scanner;
//
//public class Neal {
//        public interface ATMFeature {
//            void doFeature(Account account);
//        }
//
//        public static void main(String[] args) {
//            ATMFeature deposit = new ATMFeature() {
//                @Override
//                public void doFeature(Account account) {
//                    account.Deposit();
//                }
//            };
//            ATMFeature withdraw = new ATMFeature() {
//                @Override
//                public void doFeature(Account account) {
//                    account.WithDraw();
//                }
//            };
//            ATMFeature balance = new ATMFeature() {
//                @Override
//                public void doFeature(Account account) {
//                    account.Balance();
//                }
//            };
//            ATMFeature exit = new ATMFeature() {
//                @Override
//                public void doFeature(Account account) {
//                    account.Exit();
//                }
//            };
//
//
//            runATM((1, deposit), (2, withdraw), (3, balance), (4, exit));
//
//
//
////        boolean run = true;
////
//        while (run) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("----------------------------------");
//            //System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//            System.out.println("----------------------------------");
//            System.out.println("선택> ");
//
//            Account account = new Account();
//
//            int inputNum = scanner.nextInt();
//            switch (inputNum) {
//                case 1:
//                    account.Deposit();
//                    break;
//                case 2:
//                    account.WithDraw();
//                    break;
//                case 3:
//                    account.Balance();
//                    break;
//                case 4:
//                    account.Exit();
//                    run = false;
//                    break;
//            }
//        }
//        }
//}
