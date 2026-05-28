import java.util.*;

public class Armstrong1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        String Snum=String.valueOf(num);
        int length=Snum.length();
        int org=num;
        int sum=0;
        while(num>0){
            int digit = num%10;
            int pow=(int)Math.pow(digit,length);
            sum+= pow;
            num/=10;
        }

        if(org==sum){
            System.out.println(sum + "It is Armstrong");
        }
        else{
            System.out.println("It is not Armstrong");
        }
    }
}