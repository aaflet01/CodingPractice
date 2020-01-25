package hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapsTest {

    @Test
    void minimumSwapsEmptyArray() {
        int[] q = new int[] {};
        int expected = 0;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumSwapsSortedArray() {
        int[] q = new int[] {1,2,3,4,5,6,7};
        int expected = 0;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumSwapsSimple() {
        int[] q = new int[] {1,2,3,4,6,5,7};
        int expected = 1;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumSwapsSimpleEdge() {
        int[] q = new int[] {7,2,3,4,5,6,1};
        int expected = 1;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumSwapsComplex() {
        int[] q = new int[] {7,1,3,2,4,5,6};
        int expected = 5;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumSwapsComplex2() {
        int[] q = new int[] {3,7, 6, 9, 1, 8, 10, 4, 2, 5};
        int expected = 9  ;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }

    @Test
    void minimumSwapsComplexLong() {
        int[] q = new int[] {2,31,1,38,29,5,44,6,12,18,39,9,48,49,13,11,7,27,14,33,50,21,46,23,15,26,8,47,40,3,32,22,34,42,16,41,24,10,4,28,36,30,37,35,20,17,45,43,25,19};
        int expected = 46;

        int result = Swaps.minimumSwaps(q);
        assertEquals(expected, result);
    }
}