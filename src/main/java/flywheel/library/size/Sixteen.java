package flywheel.library.size;

public class Sixteen implements Size {
    private int value = 16;

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Size: " + this.value;
    }
}
