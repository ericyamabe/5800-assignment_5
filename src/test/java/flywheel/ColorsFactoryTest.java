package flywheel;

import flywheel.library.ColorsFactory;
import flywheel.library.colors.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ColorsFactoryTest {

    @Test
    public void testGetBlueColor() {
        String colorName = "Blue";
        ColorsFactory colorsFactory = new ColorsFactory();
        Color color = colorsFactory.getColor(colorName);
        assertEquals(color.getName(), colorName);
    }

    @Test
    public void testGetColorNotEquals() {
        String colorName = "Blue";
        ColorsFactory colorsFactory = new ColorsFactory();
        Color color = colorsFactory.getColor(colorName);
        assertNotEquals(color.getName(), "Black");
    }

    @Test
    public void testGetBlackColor() {
        String colorName = "Black";
        ColorsFactory colorsFactory = new ColorsFactory();
        Color color = colorsFactory.getColor(colorName);
        assertEquals(color.getName(), colorName);
    }

    @Test
    public void testGetRedColor() {
        String colorName = "Red";
        ColorsFactory colorsFactory = new ColorsFactory();
        Color color = colorsFactory.getColor(colorName);
        assertEquals(color.getName(), colorName);
    }
}
