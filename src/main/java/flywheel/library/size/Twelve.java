package flywheel.library.size;

public class Twelve implements Size {
    private int value = 12;

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Size: " + this.value;
    }
}
