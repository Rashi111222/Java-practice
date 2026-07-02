import java.util.*;
public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" term");
            arr[i]=sc.nextInt();
        }

        System.out.println("array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        if(isSorted)
            System.out.println("Sorted");
        else
            System.out.println("Not sorted");
    }
}
