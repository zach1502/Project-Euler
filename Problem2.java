public class Problem2 {
    public static void main(String[] args) {
        int n = 50;
        int sum = fibSum(n);

        System.out.println(sum);
    }

    public static int fibSum(int n){
        int currentTerm = 1, previousTerm = 0, previousPreviousTerm;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            previousPreviousTerm = previousTerm;
            previousTerm = currentTerm;
            currentTerm = previousPreviousTerm + previousTerm;

            if (currentTerm < 4000000){
                if (currentTerm % 2 == 0) {
                    sum += currentTerm;
                }
            }
            else{
                return sum;
            }
        }

        return sum;
    }
}