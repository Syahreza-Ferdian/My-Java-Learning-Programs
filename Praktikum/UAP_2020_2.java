package Praktikum;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UAP_2020_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        // deklarasi variabel
      	// deklarasi variabel namaMahasiswa, nilaiQuiz, nilaiUTS, dan nilaiUAS dengan tipe data array
        String[] namaMahasiswa = new String[N];
        int[] nilaiQuiz = new int[N];
        int[] nilaiUTS = new int[N];
        int[] nilaiUAS = new int[N];
      
      	
      	// deklarasi sampai disini
        double rataRataQuiz = 0.00;
        double rataRataUTS = 0.00;
        double rataRataUAS = 0.00;
        
        // input ke array
        for (int i = 0;i< N;i++){
          	//lengkapi dari sini
            namaMahasiswa[i] = scan.next();
            nilaiQuiz[i] = scan.nextInt();
            nilaiUTS[i] = scan.nextInt();
            nilaiUAS[i] = scan.nextInt();
            //sampai disini
        }
        // output rataRata nilai
        // lengkapi dari sini untuk output ratarata nilai
        rataRataQuiz = rataRata(nilaiQuiz);
        rataRataUTS = rataRata(nilaiUTS);
        rataRataUAS = rataRata(nilaiUAS);

        System.out.printf("%-21s: %.2f\n", "Rata Rata Nilai Quiz", rataRataQuiz);
        System.out.printf("%-21s: %.2f\n", "Rata Rata Nilai UTS", rataRataUTS);
        System.out.printf("%-21s: %.2f\n", "Rata Rata Nilai UAS",rataRataUAS);
      	// sampai disini
      	  
      
        // output masing masing mahasiswa
        System.out.printf("------------Nilai Mahasiswa------------%n");
        for (int i = 0;i< N;i++){
            //lengkapi disini 
          	double nilaiEnd = nilaiAkhir(nilaiQuiz[i], nilaiUTS[i], nilaiUAS[i]);
            char label = labelNilaiAkhir(nilaiEnd);
            System.out.printf("%-11s%.2f (%c)\n", namaMahasiswa[i], nilaiEnd, label);
          
          	//sampai disini
        }
    }
  	
  	//method mencari rata-rata array
  	public static double rataRata(int[] nilai){
        double rerata = 0.00;
        //lengkapi dari sini
        int jumlah = 0;
      	for(int i = 0; i < nilai.length; i++){
            jumlah += nilai[i];
        }
        rerata = (double)jumlah/nilai.length;
      	//sampai disini
        return rerata;
    }
    
  	//method mencari nilai akhir
    public static double nilaiAkhir(int quiz, int uts, int uas){
        double nilaiAkhir;
      	//lengkapi dari sini
      	nilaiAkhir = (0.25 * quiz) + (0.35 * uts) + (0.4 * uas);
      	//sampai disini
        return nilaiAkhir;
    }
    
  
  	//method label nilai akhir
    public static char labelNilaiAkhir(double nilai){
      	char labelNilaiAkhir;
      	//lengkapi dari sini
      	if(nilai > 79) labelNilaiAkhir = 'A';
        else if(nilai >= 70) labelNilaiAkhir = 'B';
        else if(nilai >= 60) labelNilaiAkhir = 'C';
        else if(nilai >= 50) labelNilaiAkhir = 'D';
        else labelNilaiAkhir = 'E';
      
      	//sampai disini
        return labelNilaiAkhir;
    } 
}