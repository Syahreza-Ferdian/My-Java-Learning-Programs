import java.util.Scanner;

public class exerciseNum10_360 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        QuadraticEquation persKuadrat = new QuadraticEquation(a, b, c);
        if(persKuadrat.getDiscriminant() > 0){
            System.out.printf("The equation has two roots %s and %s\n", String.valueOf(persKuadrat.getRoot1()), String.valueOf(persKuadrat.getRoot2()));
        }
        else if(persKuadrat.getDiscriminant() == 0){
            System.out.printf("The equation has one root %s\n", String.valueOf(persKuadrat.getRoot1()));
        }
        else System.out.printf("The equation has no real roots\n");
    }
}
class QuadraticEquation{
    private int a, b, c;
    //constructor
    QuadraticEquation(int newA, int newB, int newC){
        a = newA;
        b = newB;
        c = newC;
    }

    //accessor
    int getA(){
        return a;
    }
    int getB(){
        return b;
    }
    int getC(){
        return c;
    }

    //method
    double getDiscriminant(){
        return (Math.pow(b, 2) - (4 * a * c));
    }
    double getRoot1(){
        if(getDiscriminant() >= 0){
            return (-b + Math.sqrt(getDiscriminant()))/(2*a);
        }
        else return 0;
    }
    double getRoot2(){
        if(getDiscriminant() >= 0){
            return (-b - Math.sqrt(getDiscriminant()))/(2*a);
        }
        else return 0;
    }
}