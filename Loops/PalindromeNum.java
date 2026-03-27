import java.util.Scanner;

public class PalindromeNum{
    public static void main(String[] args) {
        int num,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();

        int org=num;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }

        if(org==rev){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not palindrome");
        }
    }
}