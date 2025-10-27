package flywheel.library.size;

public class Fourteen implements Size {
    private int value = 14;

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Size: " + this.value;
    }
}
