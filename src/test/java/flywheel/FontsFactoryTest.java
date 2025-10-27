package flywheel;

import flywheel.library.FontsFactory;
import flywheel.library.fonts.Font;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.Arrays;

public class FontsFactoryTest {
    private static String[] fonts = {"Arial", "Calibri", "Verdana"};

    @Test
    public void testGetCalibriFont() {
        String fontName = "Calibri";
        FontsFactory fontsFactory = new FontsFactory();
        Font font = fontsFactory.getFont(fontName);
        assertEquals(font.getName(), fontName);
    }

    @Test
    public void testGetFontNotEquals() {
        String fontName = "Calibri";
        FontsFactory fontsFactory = new FontsFactory();
        Font font = fontsFactory.getFont(fontName);
        assertNotEquals(font.getName(), "Arial");
    }

    @Test
    public void testGetArialFont() {
        String fontName = "Arial";
        FontsFactory fontsFactory = new FontsFactory();
        Font font = fontsFactory.getFont(fontName);
        assertEquals(font.getName(), fontName);
    }

    @Test
    public void testGetVerdanaFont() {
        String fontName = "Verdana";
        FontsFactory fontsFactory = new FontsFactory();
        Font font = fontsFactory.getFont(fontName);
        assertEquals(font.getName(), fontName);
    }
}
