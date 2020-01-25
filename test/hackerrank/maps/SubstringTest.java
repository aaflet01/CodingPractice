package hackerrank.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringTest {

    @Test
    void shortestSubstringEmptyString() {
        int expected = 0;
        int result;
        String s = new String();
        result = Substring.shortestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    void shortestSubstringSingleChar() {
        int expected = 1;
        int result;
        String s = "a";
        result = Substring.shortestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    void shortestSubstringSimple() {
        int expected = 4;
        int result;
        String s = "abcd";
        result = Substring.shortestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    void shortestSubstringComplex() {
        int expected = 5;
        int result;
        String s = "abacaaaaadccb";
        result = Substring.shortestSubstring(s);
        assertEquals(expected, result);
    }
}