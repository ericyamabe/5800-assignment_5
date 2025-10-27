package flywheel;

import flywheel.library.TextEditor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextEditorTest {
    private static String[] color = {"Black", "Blue", "Red"};
    private static String[] font = {"Arial", "Calibri", "Verdana"};
    private static Integer[] size = {12, 14, 16};

    @Test
    public void testEditor() {
        String character = "TestCharacter";
        String content ="";
        String filename = "documentTest.txt";
        TextEditor testDocument = new TextEditor();

        testDocument.setCharacter(character);
        testDocument.setColor("Blue");
        testDocument.setSize(12);
        testDocument.setFont("Calibri");
        content = testDocument.toString();
        assertEquals(content, "Character: TestCharacter, Properties: Color: Blue, Font: Calibri, Size: 12");
    }
}
