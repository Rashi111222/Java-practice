import java.util.*;

public class SumOfElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements: ");
        int n=sc.nextInt();
        int sum=0;

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" term:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of elements: "+ sum);
    }
}