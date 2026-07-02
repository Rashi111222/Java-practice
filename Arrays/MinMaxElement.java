import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" element: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Minimum element is: "+min);
        System.out.println("Maximum element is: "+max);
    }
}
