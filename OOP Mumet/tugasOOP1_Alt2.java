public class tugasOOP1_Alt2 {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7);
        System.out.println("Luas lingkaran tersebut adalah: "+lingkaran1.hitungLuas());
        System.out.println("Keliling lingkaran tersebut adalah: "+lingkaran1.hitungKeliling());

        BangunDatar persegi1 = new BangunDatar(5);
        System.out.println("Luas persegi: "+persegi1.hitungLuas());
        System.out.println("Keliling persegi: "+persegi1.hitungKeliling());
        System.out.println("Diagonal: "+persegi1.cariDiagonal());
        
        BangunDatar persegi2 = new BangunDatar();
        System.out.println(persegi2.hitungLuas());
    }
}
class BangunDatar{
    public int panjang;
    public int lebar;
    public int tinggi;

    public BangunDatar(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public BangunDatar(int sameSize){
        panjang = sameSize;
        lebar = sameSize;
    }
    public BangunDatar(){ //no arg constrcutor
        // this.panjang = 10;
        // this.lebar = 10;
    }
    public double hitungLuas(){
        return panjang * lebar;
    }
    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }
    public double cariDiagonal(){
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    }
    public int getPanjang(){
        return this.panjang;
    }
}
class Lingkaran extends BangunDatar{
    public Lingkaran(int jariJari){
        super(jariJari);
    }
    // @Override
    public double hitungLuas(){
        return Math.PI * panjang * panjang;
    }
    @Override
    public double hitungKeliling(){
        return Math.PI * panjang * 2;
    }
}
// class PersegiPanjang extends BangunDatar{
//     public PersegiPanjang(int panjang, int lebar){
//         super(panjang, lebar);
//     }
//     // @Override
//     // public double hitungLuas() {
//     //     return super.hitungLuas();
//     // }
//     // @Override
//     // public double hitungKeliling() {
//     //     return super.hitungKeliling();
//     // }
// }
class BelahKetupat extends BangunDatar{
    public BelahKetupat(int diagonal1, int diagonal2){
        super(diagonal1, diagonal2);
    }
    public double cariPanjangSisi(){
        return Math.sqrt(Math.pow(panjang/2.0, 2) + Math.pow(lebar/2.0, 2));
    }
    @Override
    public double hitungLuas(){
        return 0.5 * panjang * lebar;
    }
    @Override
    public double hitungKeliling(){
        return cariPanjangSisi() * 4;
    }
}
class JajarGenjang extends BangunDatar{
    public JajarGenjang(int alas, int tinggi){
        super(alas, tinggi);
    }
    @Override
    public double hitungLuas() {
        return super.hitungLuas();
    }
    @Override
    public double hitungKeliling() {
        return super.hitungKeliling();
    }
}
// class LayangLayang extends BelahKetupat{
//     public LayangLayang(int diagonal1, int diagonal2){
//         super(diagonal1, diagonal2);
//     }
//     @Override
//     public double hitungLuas() {
//         return super.hitungLuas();
//     }
//     public double cariSisiPanjang(){
            
//     }
// }
// class Persegi extends BangunDatar{
//     public Persegi(int panjang){
//         super(panjang);
//     }
//     @Override
//     public double hitungLuas() {
//         return super.hitungLuas();
//     }
//     @Override
//     public double hitungKeliling() {
//         return super.hitungKeliling();
//     }
// }