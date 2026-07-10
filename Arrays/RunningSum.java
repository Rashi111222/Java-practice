import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many terms: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" term: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("original array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

        for(int j=1;j<arr.length;j++){
            arr[j]=arr[j]+arr[j-1];
        }
        System.out.println("running sum array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
