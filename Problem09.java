public class Problem9{
    public static void main(String[] args) {

        int leftHandSide;
        int rightHandSide;

        for (int a = 3; a < 1000; a++) {
            for (int b = 4; b < 1000; b++) {
                for (int c = 5; c < 1000; c++) {
                    leftHandSide = a*a + b*b;
                    rightHandSide = c*c;
        
                    if (leftHandSide == rightHandSide && a + b + c == 1000) {
                        System.out.printf("%d^2 + %d^2 = %d^2 %n", a, b, c);
                    }
                }
            }
        }
    }
}
