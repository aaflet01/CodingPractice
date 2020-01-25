package hackerrank.recursion;

public class MaximalSquares {

    static boolean[][] global_arr;

    public static int findMaximumSquare(boolean[][] arr) {
        int length = 0;
        //Clone original array into a global to conserve memory with recursive calls
        global_arr = arr.clone();
        //Scan over the array left to right column-wise and then top to bottom row-wise
        //Checking length this way covers empty array case
        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[0].length; j++) {
                //If element is true then we start the search to find the square length
                if(arr[i][j]) {
                    int newLength = findSquareLength(i, j);
                    if(newLength > length) {
                        length = newLength;
                    }
                }
            }
        }
        //Need to square the length for the area
        return length*length;
    }

    private static int findSquareLength(int row, int col) {
        int maxLength = 0;
        int edges = 0;
        int i= 1;
        //Check max edge length first both horizontal and vertical by checking the elements to the right and elements below
        // checking that each is true before incrementing edge length
        while(row+i<global_arr.length && col+i < global_arr[0].length && global_arr[row+i][col] && global_arr[row][col+i]) {
            edges += 1;
            i++;
        }
        //If edges are viable and a subsquare is possible check it's length
        if(edges>=1 && row+1 < global_arr.length && col+1 < global_arr[0].length && global_arr[row+1][col+1]) {
            int subSquare = findSquareLength(row+1,col+1);
            //Take the smallest length between edges and subSquare for maximum viable square length
            maxLength = subSquare < edges ? subSquare : edges;
        }
        return maxLength+1;
    }
}
