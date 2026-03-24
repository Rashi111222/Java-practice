import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();

        System.out.println("Enter operator: ");
        char op=sc.next().charAt(0);

        if(op=='+'){
            int add=num1+num2;
            System.out.println("Addition: "+add);
        }
        else if(op == '-'){
            int sub=num1-num2;
            System.out.println("Substraction: "+sub);
        }
         else if(op == '*'){
            int mul=num1*num2;
            System.out.println("Multiplication:" +mul);
        }
        else if(op == '/'){
            int div=num1/num2;
            System.out.println("Division "+div);
        }
    }
}
