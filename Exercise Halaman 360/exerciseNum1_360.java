public class exerciseNum1_360 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.printf("Segi empat 1 dengan panjang %s dan lebar %s memiliki luas %s dan keliling %s\n", Double.toString(rectangle1.panjang), Double.toString(rectangle1.lebar), Double.toString(rectangle1.getArea()), Double.toString(rectangle1.getPerimeter()));
        System.out.printf("Segi empat 2 dengan panjang %s dan lebar %s memiliki luas %s dan keliling %s", Double.toString(rectangle2.panjang), Double.toString(rectangle2.lebar), Double.toString(rectangle2.getArea()), Double.toString(rectangle2.getPerimeter()));
    }    
}
class Rectangle{
    double panjang, lebar;

    Rectangle(){
        panjang = 1;
        lebar = 1;
    }
    Rectangle(double panjangBaru, double lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    double getArea(){
        return panjang * lebar;
    }
    double getPerimeter(){
        return 2*(panjang + lebar);
    }
}
