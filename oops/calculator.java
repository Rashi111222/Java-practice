import java.util.*;

public class calculator{
        public void add(int a,int b){
            int sum=a+b;
            System.out.println("Two integers: "+sum);
        }

        public void add(int a,int b,int c){
            int sum=a+b+c;
            System.out.println("Three integers:"+sum );
        }
        public void add(double a,double b){
            double sum=a+b;
            System.out.println("Two double: "+sum);
        }
        public static void main(String args[]){
        calculator c=new calculator();
        c.add(5,4);
        c.add(5,5,3);
        c.add(9.2,4.0);

    }
}