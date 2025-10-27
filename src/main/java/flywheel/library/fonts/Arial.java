package flywheel.library.fonts;

public class Arial implements Font {
    private String name = "Arial";

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Font: " + this.name;
    }
}
