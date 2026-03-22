import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        boolean isPrime = true;

        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= num / 2; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}