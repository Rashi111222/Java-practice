public class AreaCalculator {
    double pi=3.18;
    public void calculateArea(int s){
        int area=s*s;
        System.out.println("Area of square :"+area);
    }

    public void calculateArea(int l,int b){
        int area=l*b;
        System.out.println("Area of rectangle: "+area);
    }

    public void calculateArea(double r){
        double area=pi * r *r;
        System.out.println("Area of circle: "+area);
    }

    public static void main(String[] args) {
        AreaCalculator a= new AreaCalculator();
        
        a.calculateArea(5);
        a.calculateArea(7.0);
        a.calculateArea(5,10);
    }
}
