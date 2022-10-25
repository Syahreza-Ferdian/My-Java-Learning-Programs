package Praktikum;

public class praktik1 {
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("Biodata Mahasiswa");
        System.out.println("=================");
        System.out.println();

        String nama, asalKota, jurusan, asalSekolah, fakultas;
        int umur, tahunAngkatan;
        nama = "Syahreza Fisti Ferdian";
        asalKota = "Pati";
        jurusan = "Teknologi Informasi";
        asalSekolah = "SMAN 1 Pati";
        fakultas = "Fakultas Ilmu Komputer";
        umur = 19;
        tahunAngkatan = 2022;

        System.out.printf("Nama\t\t: %s", nama);
        System.out.printf("\nUmur\t\t: %d tahun", umur);
        System.out.printf("\nAsal\t\t: %s", asalKota);
        System.out.printf("\nFakultas\t: %s", fakultas);
        System.out.printf("\nProdi\t\t: %s", jurusan);
        System.out.printf("\nTahun Angkatan\t: %d", tahunAngkatan);
        System.out.printf("\nAsal Sekolah\t: %s", asalSekolah);
    }   
}
