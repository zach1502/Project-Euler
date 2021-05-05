import java.util.Hashtable;

public class Problem14{

    public static long initialNum;
    public static Hashtable<Long, Long> ht = new Hashtable<>();

    public static void main(String[] args){
        long terms = 0L;
        long startTime;
        long endTime;
        long maxTerms;
        long numberThatGivesMaxTerms;

        startTime = System.nanoTime();
        for (long number = 1L; number < 1000000; number++) {
            initialNum = number;
            collatz(number, terms);
        }

        maxTerms = ht.get(1L);
        numberThatGivesMaxTerms = 1;
        for (long i = 1; i < ht.size(); i++) {
            if (maxTerms < ht.get(i)) {
                maxTerms = ht.get(i);
                numberThatGivesMaxTerms = i;
            }
        }
        endTime = System.nanoTime();

        System.out.printf("The number that has the most Collatz Terms is %d %n", numberThatGivesMaxTerms);
        System.out.printf("It has %d terms %n", maxTerms);

        long duration = (endTime - startTime)/ 1000000;
        System.out.printf("Finding it took %d ms %n", duration);
    }

    public static long collatz(long number, long terms){

        terms++;

        // is 1
        if(number == 1) {
            ht.put(initialNum, terms);
            return number; 
        }

        // if exists in hashtable
        if(ht.containsKey(number)){
            terms += (ht.get(number) - 1);
            ht.put(initialNum, terms);
            return 1;
        }
    
        // is even
        if((number & 1) == 0){
            number /= 2;
            collatz(number, terms);
        }

        // is odd
        else{
            number = 3 * number + 1;
            collatz(number, terms);
        }

        return number;
    }
}