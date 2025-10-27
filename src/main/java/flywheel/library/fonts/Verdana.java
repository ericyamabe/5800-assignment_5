package flywheel.library.fonts;

public class Verdana implements Font {
    private String name = "Verdana";

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Font: " + this.name;
    }
}
