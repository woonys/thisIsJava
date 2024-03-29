package Ch16;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("홍길동", 10),
            new Student("신용권", 20),
            new Student("유미선", 30)
        );

        studentList.stream()
            .mapToInt(s->s.getScore())
            .forEach(System.out::println);
    }
}
