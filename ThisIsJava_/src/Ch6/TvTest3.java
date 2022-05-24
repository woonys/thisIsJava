package Ch6;


public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은  " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은  " + t2.channel + "입니다.");
        t2 = t1; // t1이 저장하고 있던 값을 t2에 저장. 이제 t2 인스턴스에는 접근이 불가능해진다. t2가 가리키던 인스턴스는 자신을 참조하는 참조변수가 하나도 없어지니 가비지 컬렉터에 의해 자동적으로 메모리에서 제거된다.
        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경했습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}
