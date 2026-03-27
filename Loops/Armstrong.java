import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        int arm=0;
        int digit;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number:");
        int num=sc.nextInt();
        int digits=String.valueOf(num).length();
        int org=num;
        while(num!=0){
            digit=num%10;
            num/=10;
            arm+=(int)Math.pow(digit,digits);
            
        }
        
        if(org==arm){
            System.out.println(org+ " is a armstrong number");
        }
        else{
            System.out.println(org+" is not armstrong number");
        }
    }
}