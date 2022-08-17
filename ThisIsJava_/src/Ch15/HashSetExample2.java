package Ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30)); // Memeber 인스턴스는 다르나 내부 데이터가 동일하므로 equals() 메소드에 의해 객체 1개만 저장

        System.out.println("총 객체 수: " + set.size());
    }
}
