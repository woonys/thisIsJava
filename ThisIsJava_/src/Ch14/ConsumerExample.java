package Ch14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8"); // 객체를 받아서 소비
        consumer.accept("java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u); // 객체 T와 U를 받아서 소비
        biConsumer.accept("Java", "8");

        DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d); // double 값 받아서 소비
        doubleConsumer.accept(8.0);

        ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i); // 객체 T와 int 값 받아서 소비
        objIntConsumer.accept("Java", 8);
    }
}
