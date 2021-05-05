import java.util.ArrayList;
import java.util.Arrays;

public class Problem10{
    public static void main(String[] args) {
        long sum = 0;
        ArrayList<Integer> numberlist = new ArrayList<>();
        for (int i = 2; i <= 2000000; i++) {
            numberlist.add(i);
        }
        ArrayList<Long> primeList = sieve(numberlist);

        for (int i = 0; i < primeList.size(); i++) {
            sum += primeList.get(i);
        }

        System.out.println(sum);
    }

    public static ArrayList<Long> sieve(ArrayList<Integer> numberList) {
        int prime;
        boolean[] isPrime = new boolean[numberList.size()];
        Arrays.fill(isPrime, true);

        ArrayList<Long> primeList = new ArrayList<>();
        
        // go across every single number
        for (int i = 0; i < numberList.size(); i++) {

            if (isPrime[i]) {
                prime = numberList.get(i);
                primeList.add((long)prime);

                for (int j = 1; i + j * prime < isPrime.length; j++) {
                    isPrime[i + j * prime] = false;
                }
            }
        }
        
        System.out.println(primeList);
        return primeList;
    }
}
