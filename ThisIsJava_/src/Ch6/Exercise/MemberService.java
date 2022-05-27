package Ch6.Exercise;

public class MemberService {
    String id;
    String password;

    public MemberService() {
    }

    boolean login(String id, String password) {
        if (!id.equals("hong") || !password.equals("12345")) {
            return false;
        }
        return true;
    }

    void logout(String id) {
        System.out.println("로그아웃 되었습니다");
    }
}
