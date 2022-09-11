package Ch15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    // 학번과 이름이 동일한 경우 같은 키로 인식
    public static void main(String[] args) {
        Map<Students, Integer> map = new HashMap<Students, Integer>();

        map.put(new Students(1, "홍길동"), 95);
        map.put(new Students(1, "홍길동"), 95);

        System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Map.Entry 수 얻기
    }
}
