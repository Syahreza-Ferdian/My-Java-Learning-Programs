// public class tugasOOP1_Alt {
//     public static void main(String[] args) {
//         BangunDatar lingkaran1 = new Lingkaran(7);
//         BangunDatar segiempat1 = new SegiEmpat(5, 6);

//         System.out.printf("Luas lingkaran tersebut adalah %f\n", lingkaran1.hitungLuas());
//         System.out.println("Luas, keliling, dan panjang diagonal segiempat tersebut: ");
//         System.out.printf("Luas\t\t: %f\nKeliling\t: %f\nDiagonal\t: %f", segiempat1.hitungLuas(), segiempat1.hitungKeliling(), segiempat1.hitungDiagonal());
//     }
// }

// class BangunDatar{
//     public double hitungKeliling(){
//         return 0;
//     }
//     public double hitungLuas(){
//         return 0;
//     }
//     public double hitungDiagonal(){
//         return 0;
//     }
// }

// class Lingkaran extends BangunDatar{
//     double jariJari;
    
//     public Lingkaran(double jariJari){
//         this.jariJari = jariJari;
//     }
//     public double hitungLuas(){
//         return Math.PI * jariJari * jariJari;
//     }
// }

// class SegiEmpat extends BangunDatar{
//     int panjang, lebar;

//     public SegiEmpat(int panjang, int lebar){
//         this.panjang = panjang;
//         this.lebar = lebar;
//     }
//     public double hitungLuas(){
//         return panjang * lebar;
//     }
//     public double hitungKeliling(){
//         return 2 * (panjang + lebar);
//     }
//     public double hitungDiagonal(){
//         return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
//     }
// }
