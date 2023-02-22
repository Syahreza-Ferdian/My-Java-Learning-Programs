import java.util.*;

public class tugasOOP1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan panjang jari jari lingkaran: ");
        Lingkaran lingkaran1 = new Lingkaran(scanner.nextDouble());
        System.out.print("Masukkan panjang dan lebar segiempat: ");
        SegiEmpat segiEmpat1 = new SegiEmpat(scanner.nextInt(), scanner.nextInt());

        System.out.println("\nLuas lingkaran\t: "+lingkaran1.hitungLuas());
        System.out.println("\nKeliling Segiempat\t: "+segiEmpat1.hitungKeliling());
        System.out.println("Luas Segiempat\t\t: "+segiEmpat1.hitungLuas());
        System.out.println("Diagonal\t\t: "+segiEmpat1.hitungDiagonal());
    }
}
class Lingkaran{
    double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungLuas(){
        return Math.PI * jariJari * jariJari;
    }
}
class SegiEmpat{
    int panjang, lebar;
    public SegiEmpat(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int hitungLuas(){
        return panjang * lebar;
    }
    public int hitungKeliling(){
        return 2 * (panjang + lebar);
    }
    public double hitungDiagonal(){
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }
}