package Ch15;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; // 최고 점수 받은 아이디 저장
        int maxScore = 0; // 최고 점수 저장
        int totalScore = 0; // 점수 합계 저장

        for (Entry<String, Integer> entry : map.entrySet()) {
            if(maxScore < entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }
            totalScore = totalScore + entry.getValue();
        }

        System.out.println("최고 점수: " + maxScore);
        System.out.println("평균 점수: " + totalScore/map.size());
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
