package Ch8;

public class SmartTelevision implements RemoteControl, Searchable{ // 다중 인터페이스
    private int volume;

    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            return;
        }
        if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            return;
        }
        this.volume = volume;
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
