
public class Problem15{
    public static void main(String[] args){
        
        int row = 0;
        int col = 0;

        // slow recursion
        int latticePathFound = move(row, col);
        System.out.println(latticePathFound);

        // Just use the mathimatical approach,
        // The answer is literally 40C20 
    }

    public static int move(int row, int col) {
        int maxSize = 20;
        int latticePathFound = 0;

        if(row < maxSize){
            latticePathFound += move(row + 1, col);
        }

        if(col < maxSize){
            latticePathFound += move(row, col + 1);
        }

        if(row == maxSize && col == maxSize){
            return 1;
        }

        return latticePathFound;
    }
}