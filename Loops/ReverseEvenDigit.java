public class ReverseEvenDigit {
    public static void main(String[] args) {
        int num=123456;
        int rev=0,even;

        while(num!=0){
            int digit=num%10;
            if(digit%2==0){
                rev=rev*10+digit;
            }
            num/=10;
        }
        System.out.println("Reverse of even digits is: "+rev);
    }
}
