import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args){
        String two = "2";

        BigInteger result = new BigInteger(two);
        BigInteger twoBig = new BigInteger(two);
        for (int i = 0; i < 999; i++) {
            result = result.multiply(twoBig);
        }

        System.out.println(result);
        long finalResult = 0;
        String resultStr = result.toString();

        for (int i = 0; i < resultStr.length(); i++) {
            char looking = resultStr.charAt(i);
            finalResult += Character.getNumericValue(looking);
        }

        System.out.println(finalResult);
    }
}
