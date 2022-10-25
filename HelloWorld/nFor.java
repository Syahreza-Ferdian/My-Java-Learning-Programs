/*  ____________    ________    __________
   |  __________|  (  ____  )  |  _______  )
   |  |            | |    | |  |  |      ) )
   |  |______      | |    | |  |  |______)_)
   |   ______|     | |    | |  |  |  \  \
   |  |            | |    | |  |  |   \  \     
   |  |            | |____| |  |  |    \  \
   |__|            (________)  |__|     \__\
           __              ________    ________    ___________
          |  |            (  ____  )  (  ____  )  |   _______ )
          |  |            | |    | |  | |    | |  |  |      ) )
          |  |            | |    | |  | |    | |  |  |______)_)
          |  |            | |    | |  | |    | |  |  |
          |  |            | |    | |  | |    | |  |  |
          |  |_________   | |____| |  | |____| |  |  |
          |____________|  ( ______ )  ( ______ )  |__|              E X E R C I S E
 */


import java.util.Scanner;

public class nFor {
    
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("===========[ DESKRIPSI PROGRAM ]===========");
        System.out.println("Apabila user memasukkan bilangan bulat n (baik positif maupun negatif) \nMaka program akan menampilkan: ");
        System.out.println("\t1. Semua bilangan bulat dari 1 sampai n.");
        System.out.println("\t2. Hasil faktorial dari bilangan tersebut.");
        System.out.println("\t3. Hasil penjumlahan dari semua bilangan dari 1 sampai n.");
        System.out.println("<<<===========================================================>>>");
        System.out.println("Masukkan sebuah bilangan bulat! (bisa positif atau negatif)");
        int n = input.nextInt();
        int i;
        char spacer = ' ';
        long factorial = 1;
        long total = 0;

        if (n >= 0) {    //Kondisi jika bilangan yang di-input adalah bilangan positif
            System.out.println(spacer);
            //List semua bilangan bulat dari 1 sampai n
            System.out.println("Bilangan bulat dari 1 sampai dengan " +n +" adalah: ");
            for(i = 1; i <= n; i++){
                if (i == n) {
                    System.out.println(n +".");
                }
                else System.out.print(i +", ");
            }

            System.out.println(spacer);
            //Factorial
            for(i = 1; i <= n; i++){
                factorial = factorial * i;
            }
            System.out.println("Nilai Factorial dari " +n +"! adalah " +factorial);

            System.out.println(spacer);
            //Jumlah semua bilangan bulat dari 1 sampai n
            for(i = 1; i <= n; i++){
                total = total + i;
            }
            System.out.println("Jumlah semua bilangan bulat dari 1 sampai " +n +" adalah: " +total);

        }
        if (n < 0) {     //kondisi jika n yang di-input adalah bilangan negatif
            System.out.println(spacer);
            //List semua bilangan bulat dari 1 sampai -n
            System.out.println("Bilangan bulat dari 1 sampai " +n +" adalah: ");
            for(i = 1; i >= n; i--){
                if (i == n) {
                    System.out.print(n +".");
                }
                else System.out.println(i + ", ");
            }

            System.out.println(spacer);
            //Factorial bilangan negatif = tak terdefinisi
            System.out.println("Nilai faktorial untuk bilangan negatif TIDAK TERDEFINISI");

            System.out.println(spacer);
            //Jumlah semua bilangan bulat dari 1 sampai -n
            for(i = 1; i >= n; i--){
                total = total + i;
            }
            System.out.println("Jumlah semua bilangan dari 1 sampai " +n +" adalah " +total);
        }
    }
}