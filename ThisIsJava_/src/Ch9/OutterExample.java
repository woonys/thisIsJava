package Ch9;

public class OutterExample {
    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Nested nested = outter.new Nested(); // 인스턴스 멤버 클래스는 특정 인스턴스에 종속되는 멤버 클래스이니 outter.new!
        nested.print();
    }
}
