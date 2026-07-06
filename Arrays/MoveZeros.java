import java.util.*;

public class MoveZeros{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many: ");
        int num=sc.nextInt();

        int[] arr=new int[num];
        System.out.println("Enter values");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

        int insertPosition=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPosition]=arr[i];
                insertPosition++;
            }
        }

        while(insertPosition<arr.length){
            arr[insertPosition++]=0;
        }

        System.out.println("Array after moving zeros to end: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        
    }
}