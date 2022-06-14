package Ch8;

public class InterfaceInteritenceExample {
    public static void main(String[] args) {
        ChildInterface1 ci1 = new ChildInterface1() {
            @Override
            public void method3() {
                System.out.println("this is method3");
            }

            @Override
            public void method1() {
                System.out.println("this is method1");
            }
        };

        ci1.method1();
        ci1.method2();
        ci1.method3();
    }
}
