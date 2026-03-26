import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n number: ");
        num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
             sum+=i;
        }
        System.out.println("Sum of "+num+ " natural numbers is: "+sum);
    }
}
