public class Problem18 {
    public static int largestSum = 0;
    public static void main(String[] args){
        int[][] triangle =
        
        /*{
            {3, 0, 0, 0},
            {7, 4, 0, 0},
            {2, 4, 6, 0},
            {8, 5, 9, 3}
        };*/
        {
        {75, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
        {95, 64, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
        {17, 47, 82, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
        {18, 35, 87, 10, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
        {20, 04, 82, 47, 65, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
        {19, 01, 23, 75, 03, 34, 00, 00, 00, 00, 00, 00, 00, 00, 00},
        {88, 02, 77, 73, 07, 63, 67, 00, 00, 00, 00, 00, 00, 00, 00},
        {99, 65, 04, 28, 06, 16, 70, 92, 00, 00, 00, 00, 00, 00, 00},
        {41, 41, 26, 56, 83, 40, 80, 70, 33, 00, 00, 00, 00, 00, 00},
        {41, 48, 72, 33, 47, 32, 37, 16, 94, 29, 00, 00, 00, 00, 00},
        {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14, 00, 00, 00, 00},
        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57, 00, 00, 00},
        {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48, 00, 00},
        {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31, 00},
        {04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60, 04, 23}
        }; 

        // go down == left branch
        // go down-right == right branch

        int col = 0, row = 0, sum = 0;

        long startTime = System.nanoTime();
        sum = findSums(triangle, row, col, sum);
        long endTime = System.nanoTime();

        System.out.println(sum);
        long duration = (endTime - startTime)/1000;
        System.out.printf("This took %d microseconds", duration);
    }

    public static int findSums(int[][] triangle, int row, int col, int sum) {
        int maxSize = 14;

        // 00 indicates out of bounds (not like it really matters here but hey gotta optimize)
        if (triangle[row][col] == 00) return largestSum;

        // 
        sum += triangle[row][col];

        // go left
        if (row  < maxSize) {
            findSums(triangle, row + 1, col, sum);
        }

        // go right
        if (row  < maxSize && col < maxSize) {
            findSums(triangle, row + 1, col + 1, sum);
        }

        if(sum > largestSum){
            largestSum = sum;
        }

        return largestSum;
    }
}