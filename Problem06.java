public class Problem6{
    public static void main(String[] args) {
        int n = 100;
        long sumOfSquares = summing(n);
        long squareOfSum = squaring(n);

        System.out.printf("The Sum square difference is %d", squareOfSum - sumOfSquares);
    }

    public static long summing(int n){
        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i * i;
        }

        return sum;
    }

    public static long squaring(int n){
        long sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }

        return sum*sum;
    }
}
