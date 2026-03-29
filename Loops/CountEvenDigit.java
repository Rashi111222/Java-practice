import java.util.Scanner;

public class CountEvenDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int count=0;
        int org=num;
        while(num!=0){
            int digit=num%10;
            if(digit%2==0){
                count++;
            }
            num/=10;
        }
        System.out.println("Even digits in "+org+" are: "+count);
    }
}
