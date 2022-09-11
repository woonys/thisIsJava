package Ch15;

import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수: " + score);

        score = scores.last();
        System.out.println("가장 높은 점수: " + score);

        score = scores.lower(95);
        System.out.println("95점 아래 점수: " + score);

        score = scores.higher(95);
        System.out.println("95점 위의 점수 " + score + "\n");
    }
}
