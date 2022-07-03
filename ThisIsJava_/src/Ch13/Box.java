package Ch13;

// 제네릭 쓰지 않을 때
//public class Box {
//    private Object object;
//    public void set(Object object) {this.object = object;}
//    public Object get() { return object; }
//}

// 제네릭 사용
public class Box<T> {
    private T t;
    public T get() {return t;}
    public void set(T t) {this.t = t;}
}
