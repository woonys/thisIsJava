package Ch14;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            // 람다식
            MyFuncionalInterface2 fi = ()-> {
                System.out.println("outterField = " + outterField);
                System.out.println("outterField = " + UsingThis.this.outterField + "\n"); // 바깥 객체 참조 얻으려면 클래스명.this 사용

                System.out.println("innerField = " + innerField);
                System.out.println("this.innerField = " + this.innerField + "\n"); // 람다식 내부에서 this는 inner 객체 참조
            };
            fi.method();
        }
    }
}
