package Ch15;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String>scores = new TreeMap<Integer,String>();
        scores.put(87, "홍길동");
        scores.put(98, "이동수");
        scores.put(75, "박길순");
        scores.put(95, "신용권");
        scores.put(80, "김자바");

        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for (Entry<Integer, String> entry : descendingEntrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue() + " ");
        }
        System.out.println();

        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
        for (Entry<Integer, String> entry : ascendingEntrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue() + " ");
        }
    }
}
