import java.util.*;
import java.io.*;

public class evenOddNumber{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num<=0){
            System.out.println("Number is invalid");
        }
        else if(num%2==0){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
    }
}