package a7;

public class Entry {
    private int key;
    private int value;

    public Entry (int key) {
        this.key = key;
    }

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
