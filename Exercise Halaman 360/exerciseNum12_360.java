import java.util.Scanner;

public class exerciseNum12_360 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4;
        double a, b, c, d, e, f;
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        x4 = scanner.nextDouble();
        y4 = scanner.nextDouble();
        
        a = y1 - y2;
        b = x1 - x2;
        e = a*x1 - b*y1;
        
        c = y3 - y4;
        d = x3 - x4;
        f = c*x3 - d*y3;

        LinearEquation persLinear = new LinearEquation(a, b, c, d, e, f);

        if(!persLinear.isSolvable()) System.out.println("The two lines are parallel");
        else{
            System.out.printf("The intersecting point is at (%f, %f)", persLinear.getX(), persLinear.getY());
        }
    }
}
class LinearEquation{
    private double a, b, c, d, e, f;
    //constructor
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    //accessor
    double getA(){
        return a;
    }
    double getB(){
        return b;
    }
    double getC(){
        return c;
    }
    double getD(){
        return d;
    }
    double getE(){
        return e;
    }
    double getF(){
        return f;
    }
    //methods
    boolean isSolvable(){
        if((a*d - b*c) != 0) return true;
        else return false;
    }
    double getX(){
        return (e*d - b*f)/(a*d - b*c);
    }
    double getY(){
        return (a*f - e*c)/(a*d - b*c);
    }
}