import java.util.Scanner;

public class CountFrequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            boolean seen=false;

            for(int k=0;k<i;k++){
                if(s.charAt(i)==s.charAt(k)){
                    seen=true;
                break;
                }
            }

            if(seen)
                continue; 
            int freq=0;

            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    freq++;
                }
            }
            System.out.println("Frequency of "+s.charAt(i)+" is : "+freq);
        }
    }
}