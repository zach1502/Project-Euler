public class Problem8{
    public static void main(String[] args) {
        long largestProduct = 0;
        String sequence = 
        "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        for (int i = 0; i < sequence.length()-12; i++) {
            char char1 = sequence.charAt(i);
            char char2 = sequence.charAt(i+1);
            char char3 = sequence.charAt(i+2);
            char char4 = sequence.charAt(i+3);
            char char5 = sequence.charAt(i+4);
            char char6 = sequence.charAt(i+5);
            char char7 = sequence.charAt(i+6);
            char char8 = sequence.charAt(i+7);
            char char9 = sequence.charAt(i+8);
            char char10 = sequence.charAt(i+9);
            char char11 = sequence.charAt(i+10);
            char char12 = sequence.charAt(i+11);
            char char13 = sequence.charAt(i+12);

            long num1 = Character.getNumericValue(char1);
            long num2 = Character.getNumericValue(char2);
            long num3 = Character.getNumericValue(char3);
            long num4 = Character.getNumericValue(char4);
            long num5 = Character.getNumericValue(char5);
            long num6 = Character.getNumericValue(char6);
            long num7 = Character.getNumericValue(char7);
            long num8 = Character.getNumericValue(char8);
            long num9 = Character.getNumericValue(char9);
            long num10 = Character.getNumericValue(char10);
            long num11 = Character.getNumericValue(char11);
            long num12 = Character.getNumericValue(char12);
            long num13 = Character.getNumericValue(char13);

            long product = (long)num1 * (long)num2 * (long)num3 * (long)num4 * (long)num5 * (long)num6 * (long)num7 * (long)num8 * (long)num9 * (long)num10 * (long)num11  * (long)num12 * (long)num13;
            if (product > largestProduct){
                System.out.printf("%d %d %d %d %d %d %d %d %d %d %d %d %d %n", num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13);
                largestProduct = product;
            }

        }

        System.out.println(largestProduct);

    }
}
