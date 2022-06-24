package Ch11;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone); // myPhone.toString()을 자동 호출해서 리턴값을 얻은 후 출력 -> sout 매개값은 콘솔에 출력할 내용인데, 매개값이 기본 타입(byte, short, int, long. float, double, boolean)일 경우 해당 값 그대로 출력.
        // 만약 매개값으로 객체를 주면 객체의 toString() 메소드를 호출해서 리턴값을 받아 출력. 여기서는 toString()을 우리가 오버라이딩했으니 해당 내용에 맞게 출력m
    }
}
