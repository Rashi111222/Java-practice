import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element "+i);
            arr[i]=sc.nextInt();
        }

        System.out.println("Array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        int max=-1,secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];
            }

            else if(arr[i]>secondLargest && arr[i]!=max){
                secondLargest=arr[i];
            }
        }

        System.out.println("Second Largest element: "+secondLargest);
    }
}
