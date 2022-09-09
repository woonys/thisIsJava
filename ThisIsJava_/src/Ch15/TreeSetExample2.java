package Ch15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<Integer>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        NavigableSet<Integer> desendingSet = scores.descendingSet();
        for (Integer score : desendingSet) {
            System.out.println("score = " + score);
        }
        System.out.println();

        NavigableSet<Integer> ascendingSet = desendingSet.descendingSet();

        for (Integer score : ascendingSet) {
            System.out.println("score = " + score);
        }
    }
}
