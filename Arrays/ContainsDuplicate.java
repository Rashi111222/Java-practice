import java.util.Scanner;

public class ContainsDuplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" term:");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        boolean isDuplicate=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                         isDuplicate=true;
                    break;
                }
               
            }
        }
        if(isDuplicate)
            System.out.println("Contains duplicate");
        else
            System.out.println("Doesn't contain duplicate");
    }
}