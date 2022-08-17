package Ch15;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() { // name과 age 값이 같으면 동일한 hashCode를 리턴
        return name.hashCode() + age; // String의 hashCode() 이용
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age == age);
        } else {
            return false;
        }

    }
}
