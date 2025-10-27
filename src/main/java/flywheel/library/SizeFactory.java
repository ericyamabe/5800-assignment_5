package flywheel.library;

import flywheel.library.size.Fourteen;
import flywheel.library.size.Sixteen;
import flywheel.library.size.Size;
import flywheel.library.size.Twelve;
import java.util.HashMap;

public class SizeFactory {
    private static SizeFactory instance = null;
    private HashMap<String, Size> sizes = new HashMap<>();

    public static SizeFactory getInstance() {
        if (instance == null) {
            instance = new SizeFactory();
        }
        return instance;
    }

    public Size getSize(int sizeType) {
        if(sizes.containsKey(String.valueOf(sizeType))) {
            return sizes.get(String.valueOf(sizeType));
        }

        Size size = null;
        if(sizeType == 12) {
            size = new Twelve();
        } else if(sizeType == 14) {
            size = new Fourteen();
        } else if(sizeType == 16) {
            size = new Sixteen();
        }

        sizes.put(String.valueOf(sizeType), size);
        return size;
    }
}
