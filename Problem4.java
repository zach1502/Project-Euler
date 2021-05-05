import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int currentLargest = 0;
        int product;

        for (int num1 = 10000; num1 > 1000; num1--) {
            for (int num2 = 10000; num2 > 1000; num2--) {
                product = num1 * num2;

                // lowest bounds * lowest bounds
                if (product < 1000000) continue;

                if (isPalindrome(product)){
                    result.add(product);
                }
            }
        }

        for (int i = 0; i < result.size()-1; i++) {
            if (result.get(i) > currentLargest) {
                currentLargest = result.get(i);
            }
        }
        System.out.println(currentLargest);
    }

    public static boolean isPalindrome(int number){
        String numString = Integer.toString(number);
        int leftmarker = 0;
        int rightmarker = numString.length()-1;

        for (int i = 0; i < numString.length()/2 ; i++) {
            if (numString.charAt(leftmarker) != numString.charAt(rightmarker)){
                return false;
            }

            leftmarker += 1;
            rightmarker -= 1;
        }

        return true;
    }
}