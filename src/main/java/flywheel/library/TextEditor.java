package flywheel.library;

import flywheel.library.colors.Color;
import flywheel.library.fonts.Font;
import flywheel.library.size.Size;

import java.io.*;

public class TextEditor {
    private String character;
    private Color color;
    private Font font;
    private Size size;

    public void setCharacter(String character) {
        this.character = character;
    }

    public void setColor(String color) {
        ColorsFactory colorProperty = ColorsFactory.getInstance();
        this.color = colorProperty.getColor(color);
    }

    public void setFont(String font) {
        FontsFactory fontProperty = FontsFactory.getInstance();
        this.font = fontProperty.getFont(font);
    }

    public void setSize(int size) {
        SizeFactory sizeProperty = SizeFactory.getInstance();
        this.size = sizeProperty.getSize(size);
    }

    public void save(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String contentToWrite = this.toString();
            writer.write(contentToWrite);
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public String open(String fileName) {
        StringBuilder content = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }

        return content.toString();
    }

    @Override
    public String toString() {
        return "Character: " + this.character + ", Properties: " + this.color + ", " + this.font + ", " + this.size;
    }
}
