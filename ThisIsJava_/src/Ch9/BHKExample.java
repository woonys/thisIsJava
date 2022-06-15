package Ch9;

public class BHKExample {
    class BHK {
    }

    public static void main(String[] args) {
        String name1 = new String("BHK");
        String name2 = new String("BHK");
        System.out.println(name1 == name2);


        String name3 = "BHK";
        String name4 = "BHK";
        System.out.println(name3 == name4);

    }
}
