import java.util.*;

public class SwapNumbers{
    public static void main(String args[]){
        int num1,num2,sum;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 number: ");
        num1=sc.nextInt();

        System.out.println("Enter 2 number: ");
        num2=sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("num 1:"+num1);
        System.out.println("num 2: "+num2);

        System.out.println("After swapping: ");
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("num 1:"+num1);
        System.out.println("num 2:"+num2);
    }
}