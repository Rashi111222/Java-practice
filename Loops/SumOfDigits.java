import java.util.Scanner;

public class SumOfDigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number: ");
        int num=sc.nextInt();
        int sum=0;
        int n=num;
        while(num!=0){
            int digit=num%10;
            num/=10;
            sum+=digit;
        }
        System.out.println("SUm of digits of "+n+" are: "+sum);
    }
}