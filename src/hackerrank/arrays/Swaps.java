package hackerrank.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Swaps {
    static class Pair {
        private int originalVal;
        private int originalIdx;

        public Pair(int originalVal, int originalIdx) {
            this.originalVal = originalVal;
            this.originalIdx = originalIdx;
        }

        public int getOriginalVal() {
            return originalVal;
        }

        public int getOriginalIdx() {
            return originalIdx;
        }
    }

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        boolean[] visited = new boolean[arr.length];
        Pair[] originals = new Pair[arr.length];

        for(int i=0; i < arr.length; i++) {
            originals[i] = new Pair(arr[i],i);
        }
        
        Arrays.sort(originals, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.getOriginalVal() - p2.getOriginalVal();
            }
        });

        for(int i=0; i < arr.length; i++) {
            if (visited[i] || originals[i].getOriginalIdx() == i)
                continue;

            int cycle_size = 0;
            int next = i;
            while (!visited[next]) {
                visited[next] = true;
                next = originals[next].getOriginalIdx();
                cycle_size++;
            }
            swaps += (cycle_size - 1);
        }
        return swaps;
    }

    static void printPairs(Pair[] pairs) {
        for(int i=0; i < pairs.length; i++) {
            if(i < pairs.length - 1) {
                System.out.print(String.format("<%d, %d>, ", pairs[i].getOriginalVal(), pairs[i].getOriginalIdx()));
            } else {
                System.out.print(String.format("<%d, %d>", pairs[i].getOriginalVal(), pairs[i].getOriginalIdx()));
                System.out.println("");
            }
        }
    }
}
