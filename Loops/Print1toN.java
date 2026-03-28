import java.util.Scanner;

public class Print1toN{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many terms:");
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }

    }
}