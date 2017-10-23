import org.junit.Test;
import static org.junit.Assert.*;

import exercise3.Exercise3;

public class Exercise3Test {
    @Test
    public void testTri0() {
        assertEquals(Exercise3.tri(1), 1);
    }

    @Test
    public void testTri1() {
        assertEquals(Exercise3.tri(3), 6);
    }

    @Test
    public void testTri2() {
        assertEquals(Exercise3.tri(10), 55);
    }

    @Test
    public void testLazy0() {
        assertEquals(Exercise3.lazy(3), 7);
    }

    @Test
    public void testLazy1() {
        assertEquals(Exercise3.lazy(6), 22);
    }

    @Test
    public void testLazy2() {
        assertEquals(Exercise3.lazy(9), 46);
    }
}