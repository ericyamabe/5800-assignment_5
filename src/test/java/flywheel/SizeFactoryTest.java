package flywheel;

import flywheel.library.SizeFactory;
import flywheel.library.size.Size;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.Arrays;

public class SizeFactoryTest {
    @Test
    public void testGet14Size() {
        int targetSize = 14;
        SizeFactory sizeFactory = new SizeFactory();
        Size size = sizeFactory.getSize(targetSize);
        assertEquals(size.getValue(), targetSize);
    }

    @Test
    public void testGetSizeNotEquals() {
        int targetSize = 14;
        SizeFactory sizeFactory = new SizeFactory();
        Size size = sizeFactory.getSize(targetSize);
        assertNotEquals(size.getValue(), 15);
    }

    @Test
    public void testGet12Size() {
        int targetSize = 12;
        SizeFactory sizeFactory = new SizeFactory();
        Size size = sizeFactory.getSize(targetSize);
        assertEquals(size.getValue(), targetSize);
    }

    @Test
    public void testGet16Size() {
        int targetSize = 16;
        SizeFactory sizeFactory = new SizeFactory();
        Size size = sizeFactory.getSize(targetSize);
        assertEquals(size.getValue(), targetSize);
    }
}
