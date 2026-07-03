import java.util.Scanner;

public class CountFrequencyElement {
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

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }

            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Frequency of "+arr[i]+" is : "+count);
        }
    }
}
