package Ch8;

public interface ParentInterface {
    void method1();
    default void method2() {
        System.out.println("this is method2");
    }
}
