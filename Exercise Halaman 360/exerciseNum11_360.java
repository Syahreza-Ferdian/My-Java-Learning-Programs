import java.util.Scanner;


public class exerciseNum11_360 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a, b, c, d, e, and f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        LinearEquation persLinear = new LinearEquation(a, b, c, d, e, f);

        if(!persLinear.isSolvable()) System.out.println("The equation has no solution.");
        else{
            System.out.printf("x is %s and y is %s", Double.toString(persLinear.getX()), Double.toString(persLinear.getY()));
        }
    }
}
class LinearEquation{
    private double a,b,c,d,e,f;
    //constructor
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    //getter
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
