package Ch10;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
}

// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//	at Ch10.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:5)
