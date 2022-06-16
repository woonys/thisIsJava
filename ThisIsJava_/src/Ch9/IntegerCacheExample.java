package Ch9;

public class IntegerCacheExample {
    public static void main(String[] args) {
        // case 1
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        // true

        // case 2
        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);
        // false
    }
}
