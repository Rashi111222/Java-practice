import java.util.*;
import java.io.*;

public class ReverseNumber {
    public static void main(String[] args) {
        int num;
        int rev=0;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        while(num!=0){
            int digit=num%10;
            rev= rev *10 + digit;
            num= num/10;
        }
        System.out.println("Reverse number :"+ rev);
    }
}
