package Ch10;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // main()에 들어가는 인자 args에는 어떤 실행 매개값도 주어지지 않았음.

        // 예제 수정
        if(args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println("args[0]: " + data1);
            System.out.println("args[1]: " + data2);
            return;
        }
        System.out.println("[실행 방법]");
        System.out.println("java ArrayIndexOutOfBoundsExceptionExample ");
        System.out.println("값1 값2");


    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//	at Ch10.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:5)
