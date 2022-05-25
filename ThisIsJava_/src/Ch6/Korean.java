package Ch6;

public class Korean {
    // 필드
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자
    public Korean(String name, String ssn) {
        // 매개 변수 이름은 초기화시킬 필드 이름과 비슷하거나 동일한 이름을 사용하는 것이 좋다! => this를 쓰는 이유
//        name = n;
//        ssn = s;
        this.name = name;
        this.ssn = ssn;
    }
}
