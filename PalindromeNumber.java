import java.io.*;
import java.util.*;

public class PalindromeNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        int original=num, reverse=0;

        while(num!=0){
            int digit=num%10;
            reverse=reverse * 10+digit;
            num /=10;
        }

        if(original==reverse)
        {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}