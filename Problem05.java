public class Problem5 {
    public static void main(String[] args) {
        long divisor = 20;
        boolean fullyDivisable = true;
        long lowestNumber = -1;

        for (long i = 2520; i < 2432902008176640000L; i+=20) {
            while (divisor != 1) {
                if(i % divisor != 0){
                    fullyDivisable = false;
                    break;
                }
                divisor--;
                lowestNumber = i;
                fullyDivisable = true;
            }
            if(fullyDivisable) break;
            divisor = 20;
        }

        System.out.println(lowestNumber);
    }
}
