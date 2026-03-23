import java.util.Scanner;

public class RevNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        int org=num;
        int rev=0;

        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println("Original num: "+org);
        System.out.println("Reversed num: "+rev);
    }
}