import java.util.Scanner;

public class PrintNto1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter how many terms: ");
        n=sc.nextInt();

        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}