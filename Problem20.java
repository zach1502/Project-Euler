import java.math.BigInteger;

public class Problem20 {
    public static void main(String[] args){
        BigInteger factorial = new BigInteger("1");
        
        for (int i = 0; i < 100; i++) {
            BigInteger multiplier = new BigInteger(Integer.toString(100 - i));
            factorial = factorial.multiply(multiplier);
        }

        BigInteger finalResult = new BigInteger("0");
        String resultStr = factorial.toString();
        System.out.println(resultStr);

        for (int i = 0; i < resultStr.length(); i++) {
            char ch = resultStr.charAt(i);
            String value = Character.toString(ch);
            BigInteger bigValue = new BigInteger(value);

            finalResult = finalResult.add(bigValue);
        }

        String output = finalResult.toString();

        System.out.println(output);
    }
}
