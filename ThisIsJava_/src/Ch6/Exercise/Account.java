package Ch6.Exercise;

public class Account {
    // 정적 필드 -> 모든 객체에 대해 동등!
    static int MIN_BALANCE = 0;
    static int MAX_BALANCE = 1_000_000;
    int balance;

    public Account() {
        balance = 0;
    }

    // 메소드
    //Setter
    public void setBalance(int x) {
        if (x < MIN_BALANCE || x > MAX_BALANCE) {
            return;
        }
        this.balance = x;
    }
    //Getter
    public int getBalance() {
        return this.balance;
    }

}
