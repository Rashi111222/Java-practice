import java.util.*;

public class MinElementArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" term: ");
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+" ");
        }

        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is: "+min);
    }
}