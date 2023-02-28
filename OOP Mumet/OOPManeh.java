//domain 
class Car{
    //Constructor = kelas yang akan selalu dipanggil pertama kali(default) pada saat obj dibuat ketika menggunakan objek, pembeda dari kelas yang lain
    public String noPol = "";
    public int power = 100;
    public int seat = 4;
    public String namaMobil;
    //fungsi consturctor = namanya sama dgn nama kelas
    public Car(String nomor_polisi, String carName, int seat_capacity){  //--> bisa diberi macam2 variabel input
        this.noPol = nomor_polisi;  //--> 'this' merujuk pada sesuatu yang ada di kelas sendiri, bisa atribut bisa method
        this.seat = seat_capacity;
        this.namaMobil = carName;
        System.out.println("\nBerhasil membuat "+this.namaMobil+ " dengan no pol : " +this.noPol +" dengan kapasitas " +this.seat);
        //'penyederhaan'/ 'enkapsulasi' --> 
    }

    //behaviour
    public void maju(){
        System.out.println(this.noPol +" Bergerak maju");        
    }

    public void mundur(){
        System.out.println(this.noPol +" Bergerak mundur");
    }
}
class PetrolCar extends Car{
    public int kapasitasBBM = 50;
    public int isiTangkiBBM = 0;

    public PetrolCar(String noPol, String namaMobil, int seat, int isiTangkiBBM){
        super(noPol, namaMobil, seat);
        this.isiTangkiBBM = isiTangkiBBM;
    }
    public void isiBBM(int beliBerapa){
        isiTangkiBBM += beliBerapa;
        System.out.printf("Berhasil membeli bensin untuk %s sebanyak %d liter! Isi tanki sekarang %d liter\n", namaMobil, beliBerapa, isiTangkiBBM);
    }
}

class ElectricCar extends Car{
    public int dayaListrik = 200;
    public int sisaEnergiListrik = 0;

    public ElectricCar(String noPol, String namaMobil, int seat, int sisaEnergiListrik){
        super(noPol, namaMobil, seat);
        this.sisaEnergiListrik = sisaEnergiListrik;
    }
    public void isiKwh(int beliBerapa){
        sisaEnergiListrik += beliBerapa;
        System.out.printf("Berhasil mengisi KwH untuk %s sebanyak %d KwH! Total KwH sekarang %d\n", namaMobil, beliBerapa, sisaEnergiListrik);
    }
}

public class OOPManeh {
    public static void main(String[] args) {
        //membuat objek dari kelas car
        Car angkot1 = new Car("N 123 GG", "Angkot", 12); // --> di create spt yang di cons
        angkot1.maju();
        angkot1.mundur();

        /*System.out.println(angkot1.power);
        System.out.println(angkot1.seat);*/

        Car angkot2 = new Car("N 456 SM", "Angkot", 2);
        angkot2.maju();
        angkot2.mundur();

        PetrolCar mobil1 = new PetrolCar("K 123 ZA", "Innova Reborn", 7, 30);
        mobil1.isiBBM(20);
        mobil1.maju();

        ElectricCar mobil2 = new ElectricCar("K 4444 JI", "Toyota Prius", 5, 20);
        mobil2.isiKwh(20);
        mobil2.mundur();
    }
    
}