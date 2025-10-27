package flywheel.library.colors;

public class Red implements Color {
    private String name = "Red";

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Color: " + this.name;
    }
}
