import  java.util.Scanner;

public class FirstNonRepeat{
    public static void main(String[] args) throws Exception{
        System.out.println("Enter your number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        String s=String.valueOf(num);

        for(int i=0;i<s.length();i++){
            int count=0;

            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
            System.out.println("First non repeating no: "+s.charAt(i));
            break;
        }
        }
       
    }
}