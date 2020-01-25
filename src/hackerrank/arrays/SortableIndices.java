package hackerrank.arrays;

public class SortableIndices {

    public static int[] findIndices(int[] unsortedArray) {
        int m=-1;
        int n=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        if(unsortedArray==null || unsortedArray.length < 2) {
            return null;
        }
        max = unsortedArray[0];
        for(int i=0; i < unsortedArray.length-1; i++) {
            //If unsorted left to right then set n and max
            if(unsortedArray[i] > unsortedArray[i+1] || unsortedArray[i+1] < max) {
                n = i+1;
            }
            if(unsortedArray[i] > max) {
                max = unsortedArray[i];
            }
        }
        for(int i=unsortedArray.length-1; i > 0; i--) {
            //If unsorted right to left then set m and min
            if(unsortedArray[i] < unsortedArray[i-1] || unsortedArray[i-1] > min) {
                m = i-1;
            }
            if(unsortedArray[i] < min) {
                min = unsortedArray[i];
            }
        }
        if(m == -1 && n == -1) {
            return null;
        }
        return new int[] {m,n};
    }
}
