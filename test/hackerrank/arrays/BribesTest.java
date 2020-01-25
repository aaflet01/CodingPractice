package hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BribesTest {

    @Test
    void minimumBribesEmptyArray() {
        int[] q = new int[] {};
        String expected = "0";

        String result = Bribes.minimumBribes(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumBribesNoBribes() {
        int[] q = new int[] {1,2,3,4,5,6,7,8};
        String expected = "0";

        String result = Bribes.minimumBribes(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumBribesSimpleBribe() {
        int[] q = new int[] {1,2,3,4,6,5,7,8};
        String expected = "1";

        String result = Bribes.minimumBribes(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumBribesComplexBribes() {
        int[] q = new int[] {3,4,5,2,7,8,6,1};
        String expected = "12";

        String result = Bribes.minimumBribes(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumBribesTooChaotic() {
        int[] q = new int[] {1,2,3,8,4,7,5,6};
        String expected = "Too chaotic";

        String result = Bribes.minimumBribes(q);
        assertEquals(expected, result);
    }

    /* test /* more test */
    @Test
    void testTest() {
        Float f = new Float("3.0");
        int i = f.intValue();
        byte b = f.byteValue();
        double d = f.doubleValue();
        System.out.println(i+b+d);
        Bribes.test();
    }
}