public class Problem12{
    public static void main(String[] args) {
        long sum = 0;
        int n = 1;
        int divisors;

        for (divisors = 1; divisors < 5; n++) {
            sum = nthTriangleSum(n);
            divisors = divisorCount(sum);


                System.out.printf("The triangle sum %d %n", sum);
                System.out.printf("it has %d divisors. %n", divisors);
                System.out.printf("the highest number summed is %d %n", n);

        }
        System.out.printf("The triangle sum %d %n", sum);
        System.out.printf("it has %d divisors. %n", divisors);
    }

    public static long nthTriangleSum(int n){
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int divisorCount(long sum){
        int divisorCount = 1;

        for (int i = 1; i <= sum; i++) {
            if(sum % i == 0){
                divisorCount++;
            }
        }

        return divisorCount;
    }
}