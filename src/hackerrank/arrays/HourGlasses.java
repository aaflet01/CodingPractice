package hackerrank.arrays;

public class HourGlasses {
    public static int hourGlassSum(int[][] arr) {
        //Calculate max sum of an hour glass mask as shown below:
        // 1 1 1
        // 0 1 0
        // 1 1 1
        //Strategy is to scan left to right column-wise and top to bottom row-wise applying the mask
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if(arr.length == 0 || arr[0].length < 3) {
            return 0;
        }

        //since mask is 3x3 we can reduce looping to avoid array out of bounds
        for(int i=0; i < arr.length-2; i++) {
            for(int j=0; j < arr[i].length-2; j++) {
                sum =   arr[i][j] + arr[i][j+1]+ arr[i][j+2] +
                                  arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
