import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many terms: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of even number from "+n+" is :"+sum);
    }
}
