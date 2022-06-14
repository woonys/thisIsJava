//package Neal;
//
//import java.util.Scanner;
//import java.util.Map;
//
//public interface ATMFeature {
//    void doFeature(Account account);
//
//    public static void runATM(Map<Integer, ATMFeature> accountFeatures) {
//        boolean run = true;
//        Scanner scanner = new Scanner();
//        Account account = new Account();
//
//        int inputNum = scanner.nextInt();
//        while (run) {
//            accountFeatures.get(inputNum)
//                           .doFeature(account);
//        }
//    }
//}
