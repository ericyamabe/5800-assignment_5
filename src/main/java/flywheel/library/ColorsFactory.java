package flywheel.library;

import flywheel.library.colors.Black;
import flywheel.library.colors.Blue;
import flywheel.library.colors.Color;
import flywheel.library.colors.Red;
import java.util.HashMap;

public class ColorsFactory {
    private static ColorsFactory instance = null;
    private HashMap<String, Color> colors = new HashMap<>();

    public static ColorsFactory getInstance() {
        if (instance == null) {
            instance = new ColorsFactory();
        }
        return instance;
    }

    public Color getColor(String colorType) {
        if(colors.containsKey(colorType)) {
            return colors.get(colorType);
        }

        Color color = null;
        if(colorType == "Black") {
            color = new Black();
        } else if(colorType == "Blue") {
            color = new Blue();
        } else if(colorType == "Red") {
            color = new Red();
        }

        colors.put(colorType, color);
        return color;
    }
}
