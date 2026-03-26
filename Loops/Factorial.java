import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("factorial of "+num+" is: "+fact);
    }
}