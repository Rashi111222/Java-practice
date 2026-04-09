import java.util.Scanner;

public class GCD{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=sc.nextInt();
        System.out.println("Enter b: ");
        b=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
    }
}