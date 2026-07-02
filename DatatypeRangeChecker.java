import java.util.*;
import java.math.BigInteger;

public class DatatypeRangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                BigInteger x = sc.nextBigInteger();
                System.out.println(x + " can be fitted in:");
                
                if (x.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    x.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                }
                if (x.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    x.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                }
                if (x.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    x.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                }
                if (x.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    x.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}

