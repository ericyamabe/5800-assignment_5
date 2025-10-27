package flywheel.library.fonts;

public class Calibri implements Font {
    private String name = "Calibri";

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Font: " + this.name;
    }
}
