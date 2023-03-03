public class exerciseNum9_360 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon 1 Perimeter = %.3f, area = %.3f\n", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("Polygon 2 Perimeter = %.3f, area = %.3f\n", polygon2.getPerimeter(), polygon2.getArea());
        System.out.printf("Polygon 3 Perimeter = %.3f, area = %.3f\n", polygon3.getPerimeter(), polygon3.getArea());
    }
}
class RegularPolygon{
    private int n;
    private double side, x, y;

    //constructor
    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    RegularPolygon(int numberOfSides, double sideLength){
        n = numberOfSides;
        side = sideLength;
        x = 0; 
        y = 0;
    }
    RegularPolygon(int numberOfSides, double sideLength, double specX, double specY){
        n = numberOfSides;
        side = sideLength;
        x = specX;
        y = specY;
    }

    //accessor
    int getN(){
        return n;
    }
    double getSide(){
        return side;
    }
    double getX(){
        return x;
    }
    double getY(){
        return y;
    }

    //mutator
    void setN(int newN){
        n = newN;
    }
    void setSide(int newSide){
        side = newSide;
    }
    void setX(int newX){
        x = newX;
    }
    void setY(int newY){
        y = newY;
    }

    //methods
    double getPerimeter(){
        return side * n;
    }
    double getArea(){
        return (n * Math.pow(side, 2))/(4 * Math.tan(Math.PI/n));
    }
}
