package flywheel;

import flywheel.library.TextEditor;

public class Driver {
    public static void main(String[] args) {
        String character = "HelloWorldCS5800";
        String content = "";
        String filename = "documentTest.txt";
        TextEditor firstDocument = new TextEditor();
        TextEditor secondDocument = new TextEditor();
        TextEditor thirdDocument = new TextEditor();
        TextEditor fourthDocument = new TextEditor();

        firstDocument.setCharacter(character);
        firstDocument.setColor("Blue");
        firstDocument.setSize(12);
        firstDocument.setFont("Calibri");
        firstDocument.save(filename);
        content = firstDocument.open(filename);
        System.out.print(content + "\n");

        secondDocument.setCharacter(character);
        secondDocument.setColor("Black");
        secondDocument.setSize(14);
        secondDocument.setFont("Verdana");
        secondDocument.save(filename);
        content = secondDocument.open(filename);
        System.out.print(content + "\n");

        thirdDocument.setCharacter(character);
        thirdDocument.setColor("Red");
        thirdDocument.setSize(16);
        thirdDocument.setFont("Arial");
        thirdDocument.save(filename);
        content = thirdDocument.open(filename);
        System.out.print(content + "\n");

        fourthDocument.setCharacter(character);
        fourthDocument.setColor("Blue");
        fourthDocument.setSize(14);
        fourthDocument.setFont("Verdana");
        fourthDocument.save(filename);
        content = fourthDocument.open(filename);
        System.out.print(content);
    }
}
