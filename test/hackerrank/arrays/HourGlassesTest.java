package hackerrank.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourGlassesTest {

    @Test
    void hourGlassSumEmpty() {
        int[][] arr = {{}};
        int expected = 0;

        int result = HourGlasses.hourGlassSum(arr);
        assertEquals(expected, result);
    }

    @Test
    void hourGlassSumSimple() {
        int[][] arr = { {1,1,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,1,1,0,0,0},
                        {0,0,2,4,4,0},
                        {0,0,0,2,0,0},
                        {0,0,1,2,4,0}};
        int expected = 19;

        int result = HourGlasses.hourGlassSum(arr);
        assertEquals(expected, result);
    }

    @Test
    void hourGlassSumCheckBounds() {
        int[][] arr = { {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0}};
        int expected = 19;

        int result = HourGlasses.hourGlassSum(arr);
        assertEquals(expected, result);
    }

    @Test
    void hourGlassSumNegatives() {
        int[][] arr = { {-1,-1,0,-9,-2,-2},
                        {-2,-1,-6,-8,-2,-5},
                        {-1,-1,-1,-2,-3,-4},
                        {-1,-9,-2,-4,-4,-5},
                        {-7,-3,-3,-2,-9,-9},
                        {-1,-3,-1,-2,-4,-5}};
        int expected = -6;

        int result = HourGlasses.hourGlassSum(arr);
        assertEquals(expected, result);
    }
}