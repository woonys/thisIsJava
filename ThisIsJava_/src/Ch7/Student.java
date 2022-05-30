package Ch7;

public class Student extends People {
    public int studentNo;

    public Student(String name, String ssn, int studentNo) { // 에러 뜬다 -> 부모 객체 People에 생성자가 없다고!
        super(name, ssn); // -> 부모 생성자 호출! 이 코드로 인해 에러 사라짐
        this.studentNo = studentNo;
    }
}
