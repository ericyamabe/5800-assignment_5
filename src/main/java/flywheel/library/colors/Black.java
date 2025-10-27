package flywheel.library.colors;

public class Black implements Color {
    private String name = "Black";

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Color: " + this.name;
    }
}
