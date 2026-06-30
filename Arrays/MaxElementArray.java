import java.util.*;

public class MaxElementArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" element: ");
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
}
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            if(max<arr[j]){
                max=arr[j];
            }
        }
        System.out.println("Maximum element: "+max);

    }
}