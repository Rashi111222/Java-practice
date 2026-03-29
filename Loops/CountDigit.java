import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int count=0;
        int org=num;
        while(num!=0){
            int digit=num%10;
            count++;
            num/=10;
        }
        System.out.println("Digits in "+org+" are: "+count);
    }
}