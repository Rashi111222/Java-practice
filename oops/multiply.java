public class multiply{
    public int mult(int a,int b)
    {
        int m=a*b;
        System.out.println("Two integers:"+m);
        return m;
    }

    public double mult(double a,double b)
    {
        double m=a*b;
        System.out.println("Two double:"+m);
        return m;
    }

    public double mult(int a,double b){
        double m=a*b;
        System.out.println("Int n double:"+m);
        return m;
    }

    public static void main(String args[]){
        multiply m=new multiply();

        double result=m.mult(6,4.0);
        double res=m.mult(4.2,8.2);
        int r=m.mult(2,4);
    }

}