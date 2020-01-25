package hackerrank.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalSquaresTest {

    @Test
    void findMaximumSquareEmptyArray() {
        boolean[][] arr = {{}};
        int expected = 0;

        int result = MaximalSquares.findMaximumSquare(arr);
        assertEquals(expected, result);
    }

    @Test
    void findMaximumSquareSingleElement() {
        boolean[][] arr = {{true}};
        int expected = 1;

        int result = MaximalSquares.findMaximumSquare(arr);
        assertEquals(expected, result);
    }

    @Test
    void findMaximumSquareEdges() {
        boolean[][] arr = { {true,true,true,true,true},
                            {true,false,false,false,true},
                            {true,true,true,true,true}};
        int expected = 1;

        int result = MaximalSquares.findMaximumSquare(arr);
        assertEquals(expected, result);
    }

    @Test
    void findMaximumAllTrue() {
        boolean[][] arr = { {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true},
                            {true,true,true,true,true}};
        int expected = 25;

        int result = MaximalSquares.findMaximumSquare(arr);
        assertEquals(expected, result);
    }

    @Test
    void findMaximumSquareSmallMultipleSameSize() {
        boolean[][] arr = { {false,false,true,true,true},
                            {true,false,true,true,true},
                            {false,true,false,true,false}};
        int expected = 4;

        int result = MaximalSquares.findMaximumSquare(arr);
        assertEquals(expected, result);
    }

    @Test
    void findMaximumSquareSmallMultipleDiffSize() {
        boolean[][] arr = { {false,false,true,true,true},
                            {true,false,true,true,true},
                            {false,true,true,true,true}};
        int expected = 9;

        int result = MaximalSquares.findMaximumSquare(arr);
        assertEquals(expected, result);
    }
}