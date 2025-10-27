package flywheel.library;

import flywheel.library.fonts.Arial;
import flywheel.library.fonts.Calibri;
import flywheel.library.fonts.Font;
import flywheel.library.fonts.Verdana;
import java.util.HashMap;

public class FontsFactory {
    private static FontsFactory instance = null;
    private HashMap<String, Font> fonts = new HashMap<>();

    public static FontsFactory getInstance() {
        if (instance == null) {
            instance = new FontsFactory();
        }
        return instance;
    }

    public Font getFont(String fontType) {
        if(this.fonts.containsKey(fontType)) {
            return this.fonts.get(fontType);
        }

        Font font = null;

        if(fontType == "Arial") {
            font = new Arial();
        } else if(fontType == "Calibri") {
            font = new Calibri();
        } else if(fontType == "Verdana") {
            font = new Verdana();
        }

        this.fonts.put(fontType, font);
        return font;
    }
}
