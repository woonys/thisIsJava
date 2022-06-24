package Ch11;

import java.util.Arrays;
import java.util.Objects;

public class EqualsANdDeepEqualsExample {
    public static void main(String[] args) {
        Integer o1 = 1000;
        Integer o2 = 1000;
        System.out.println("o1, o2 is: "+Objects.equals(o1, o2));
        System.out.println("o1, null is: "+Objects.equals(o1, null));
        System.out.println("null, o2 is: "+Objects.equals(null, o2));
        System.out.println("null, null is: "+Objects.equals(null, null));
        System.out.println("o1, o2 is: "+Objects.deepEquals(o1, o2) + "\n");

        Integer[] arr1 = { 1, 2 };
        Integer[] arr2 = { 1, 2 };
        System.out.println("equals- arr1, arr2 is: "+Objects.equals(arr1, arr2));
        System.out.println("deepEquals- arr1, arr2 is: "+Objects.deepEquals(arr1, arr2));
        System.out.println("deepEquals(Array)- arr1, arr2 is: "+Arrays.deepEquals(arr1, arr2)); // 서로 다른 배열일 때 항목 값이 모두 같다면 true를 리턴
        System.out.println("deepEquals-null, arr2 is: "+Objects.deepEquals(null, arr2));
        System.out.println("deepEquals-arr1, null is: "+Objects.deepEquals(arr1, null));
        System.out.println("deepEquals-null, null is: "+Objects.deepEquals(null, null));
    }
}
