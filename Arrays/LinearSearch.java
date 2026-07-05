import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" term");
            arr[i]=sc.nextInt();
        }

        System.out.println("array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Enter target to search: ");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target found at: "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("target not found");
        }
}
}