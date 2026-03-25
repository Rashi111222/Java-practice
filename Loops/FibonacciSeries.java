import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String args[]){
        int a=0,b=1,c;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms till you want to print: ");
        n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}