/* WIP */
/* WIP */
/* WIP */
/* WIP */
/* WIP */

import java.util.ArrayList;
import java.util.Hashtable;

public class Problem21{
    public static void main(String[] args){
        Hashtable<Integer, Integer> numberWithSum = new Hashtable<>();
        Hashtable<Integer, Integer> amicablePairs = new Hashtable<>();
        ArrayList<Integer> divisorList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i < 10000; i++) { //O(n)
            divisorList = findDivisors(i); //O(sqrt(n))

            for (int j = 0; j < divisorList.size(); j++) { //O(n)
                sum += divisorList.get(j);
            }
            // key, value
            numberWithSum.put(i, sum);
            sum=0;
        }

        for (int i = 1; i < numberWithSum.size(); i++) { // O(n)
            int sum1 = numberWithSum.get(i);

            for (int j = 1; j < numberWithSum.size(); j++) {// O(n)
                if (i==j) continue;
                int sum2 = numberWithSum.get(j);
                if (sum1 == sum2) {
                    amicablePairs.put(i, j);
                }
            }
        }

        System.out.println(amicablePairs);
        long finalSum = 0;
        for (int i = 0; i < 10000; i++) { // O(n)
            if(amicablePairs.containsKey(i)){
                finalSum += i;
            }
        }
        System.out.println(finalSum);
    }

    public static ArrayList<Integer> findDivisors(int n){
        ArrayList<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i){
                    divisorList.add(i);
                }
                else{
                    divisorList.add(i);
                    divisorList.add(n/i);
                }
            }
        }
        System.out.println(divisorList);
        return divisorList;
    }
}