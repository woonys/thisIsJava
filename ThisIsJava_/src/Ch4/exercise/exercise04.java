package Ch4.exercise;

public class exercise04 {
    public static void main(String[] args) {
        int diceNum1;
        int diceNum2;
        int sum;
        do {
            diceNum1 = (int)(Math.random()*6) + 1; // Math.random은 float -> 반드시 타입캐스팅해줘야 한다!
            diceNum2 = (int)(Math.random()*6) + 1; // Math.random은 float -> 반드시 타입캐스팅해줘야 한다!
            sum = diceNum1 + diceNum2;
            System.out.println("("+diceNum1 + ", " + diceNum2 + ")");
        } while (sum != 5);
    }
}
