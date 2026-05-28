import java.util.*;

public class Pattern7{
    public static void main(String args[]){
        int j=1;

        for(int i=1;i<=4;i++){
            for(;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}