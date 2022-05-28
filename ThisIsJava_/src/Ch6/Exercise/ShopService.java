package Ch6.Exercise;

public class ShopService {
    /* 싱글톤 생성: 클래스 외부에서 new 연산자로 생성자 호출 못하도록 막아야 함.
    생성자를 호출한만큼 객체가 만들어지는데 싱글톤은 오직 객체 하나만 만들도록 보장해야 하기 때문!

    * */

    // 싱글톤 생성 1: 정적 필드 생성
    private static ShopService shopService = new ShopService();
    // 싱글톤 생성 2: 생성자
    private ShopService() { // 생성자를 외부에서 호출할 수 없도록 하려면 생성자 앞에 private 접근 제한자를 붙인다.
    }
    // 싱글톤 생성 3: 정적 메소드 생성
    private static ShopService getInstance() { // 생성자 접근 막는대신 외부에서 클래스 호출할 수 있도록 정적 메소드인 getInstance()를 선언
        return shopService;// 정적 필드에서 참조하고 있는 자신의 객체를 리턴해준다.
    }
}
