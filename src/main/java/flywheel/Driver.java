package flywheel;

import flywheel.library.TextEditor;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        String character = "HelloWorldCS5800";
        String content = "";
        String filename = "documentTest.txt";

        for(char charact : character.toCharArray()) {
            TextEditor characterDocument = new TextEditor();
            characterDocument.setCharacter(String.valueOf(charact));
            characterDocument.setColor(randomlySelectColor());
            characterDocument.setSize(randomlySelectSize());
            characterDocument.setFont(randomlySelectFont());
            characterDocument.save(filename);
            content = characterDocument.open(filename);
            System.out.print(content + "\n");
        }
    }

    private static String randomlySelectColor() {
        String[] colors = new String[] {"Blue", "Red", "Black"};
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }

    private static Integer randomlySelectSize() {
        Integer[] size = new Integer[] {12, 14, 16};
        Random random = new Random();
        int randomIndex = random.nextInt(size.length);
        return size[randomIndex];
    }

    private static String randomlySelectFont() {
        String[] fonts = new String[] {"Arial", "Calibri", "Verdana"};
        Random random = new Random();
        int randomIndex = random.nextInt(fonts.length);
        return fonts[randomIndex];
    }
}
