package hackerrank.arrays;

public class Bribes {
    public static String minimumBribes(int[] q) {
        int minBribes = 0;
        for(int i=q.length-1; i >= 0; i--) {
            if(q[i] != i+1) {
                //If one bribe away then swap those two elements
                if(i-1 >= 0 && q[i-1] == i+1) {
                    q[i-1] = q[i];
                    q[i] = i+1;
                    minBribes++;
                } else if (i-2 >= 0 && q[i-2] == i+1) {
                    //Else if 2 bribes away shift the two previous elements and place swap element
                    q[i-2] = q[i-1];
                    q[i-1] = q[i];
                    q[i] = i+1;
                    minBribes+=2;
                } else {
                    //Else funny business
                    return "Too chaotic";
                }
            }
        }
        return Integer.toString(minBribes);
    }

    public static int test() {
        short s = 9;
        int i = 6;

        return s+i;
    }
}
