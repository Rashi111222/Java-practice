public class SecondLargest {
    public static void main(String args[]){
        int num=122333;
        String s=String.valueOf(num);
        int second=-1;
        int max=-1;

        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)- '0';
        
            if(digit>max){
                second=max;
                max=digit;
            }

            else if(digit>second && digit!=max){
                second=digit;
            }
    }
    System.out.println("Second highest is: "+second);
}
}
    