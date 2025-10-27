package flywheel.library.colors;

public class Blue implements Color {
    private String name = "Blue";

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Color: " + this.name;
    }
}
