public class Problem7{
    public static void main(String[] args) {
        int limit = 10001;
        int nthPrime = 1;
        int number = 1;
        int currentPrime = 0;

        while(nthPrime <= limit) {
            if(isPrime(number)){
                nthPrime++;
                currentPrime = number;
            }

            // since it must be odd
            number+=2;
        }

        System.out.println(currentPrime);
    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
