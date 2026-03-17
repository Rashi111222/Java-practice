import java.util.Scanner;

public class SwapTwoNumbers{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter value of 1 number: ");
        a=sc.nextInt();

        System.out.println("Enter value of 2 number: ");
        b=sc.nextInt();

        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of 1 after swapping: "+a);
        System.out.println("Value of 2 after swapping: "+b);
    }
}