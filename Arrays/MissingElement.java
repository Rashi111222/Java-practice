import java.util.*;

public class MissingElement {
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

        
        for(int num=0;num<=n;num++){
            boolean found=false;
            for(int i=0;i<arr.length;i++){
                if(num==arr[i]){
                    found=true;
                    break;
                }
            }
            if(!found){
            System.out.println("Missing element is: "+num);
        }
        }
        
    }
}
