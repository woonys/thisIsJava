package Ch13;

public class Containers<K, V> {
    public K key;
    public V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
