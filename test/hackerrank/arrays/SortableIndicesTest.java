package hackerrank.arrays;

import hackerrank.arrays.SortableIndices;
import org.junit.Assert;
import org.junit.Test;

public class SortableIndicesTest {

    @Test
    public void testFindIndicesEmpty() {
        int[] unsortedArray = new int[] {};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        Assert.assertNull(indices);
    }

    @Test
    public void testFindIndicesSingleElement() {
        int[] unsortedArray = new int[] {1};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        Assert.assertNull(indices);
    }

    @Test
    public void testFindIndicesSorted() {
        int[] unsortedArray = new int[] {1,2,3,4,5,6,7,8};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        Assert.assertNull(indices);
    }

    @Test
    public void testFindIndicesUnsorted() {
        int[] unsortedArray = new int[] {1,2,4,3,6,5,7,8};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        int[] expected = new int[]{2,5};
        Assert.assertArrayEquals(expected, indices);
    }

    @Test
    public void testFindIndicesReverseSort() {
        int[] unsortedArray = new int[] {8,7,6,5,4,3,2,1};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        int[] expected = new int[]{0,7};
        Assert.assertArrayEquals(expected, indices);
    }

    @Test
    public void testFindIndicesRandom() {
        int[] unsortedArray = new int[] {-10,20,-20,40,50,60,70,-90};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        int[] expected = new int[]{0,7};
        Assert.assertArrayEquals(expected, indices);
    }

    @Test
    public void testFindIndicesRepeats() {
        int[] unsortedArray = new int[] {1,2,4,7,10,11,7,12,6,7,16,18,19};
        int[] indices = SortableIndices.findIndices(unsortedArray);
        int[] expected = new int[]{3,9};
        Assert.assertArrayEquals(expected, indices);
    }
}