
public class Problem3 {
    public static void main(String[] args) {
        long n = 600851475143L;

        long startTime = System.nanoTime();
        long factorAlt = GPFalt(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.printf("%d is the highest prime factor", factorAlt);
        System.out.printf("took %d micro seconds to find", duration/1000);
    }

    public static long GPFalt(long n){
        long number = n;
        long largestDivisor = 1;
        long divisor = 2;

        while(number != 1) {
            if (number % divisor == 0){
                if (largestDivisor < divisor) {
                    largestDivisor = divisor;
                }
                number /= divisor;
                divisor = 2;
            }
            else{
                divisor++;
            }
        }

        return largestDivisor;
    }
}
