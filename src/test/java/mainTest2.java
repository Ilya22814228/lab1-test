import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class mainTest2 {

    @Test
    public void main2() {
        int a = 210;
        int b = 195;
        int c = main.main2(a,b);
        assertEquals(15, c);
    }
}
