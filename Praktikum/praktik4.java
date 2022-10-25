package Praktikum;

public class praktik4 {
    public static void main(String[] args) {
        System.out.printf("%s%c\n", "Pemrograman Java", '|');
        System.out.printf("%30s%c\n", "Pemrograman Java", '|'); //Nambah 30 character spasi sebelum string awal. 30 itu termasuk kata "Pemrograman Java"
        System.out.printf("%-30s%c\n", "Pemrograman Java", '|');//Nambah 30 character spasi setelah kata "Pemrograman Java". 30 character termasuk kata "Pemrograman Java"
        System.out.printf("%30.5s%c\n", "Pemrograman Java", '|');//Nambah 30 character sebelum string awal, namun yg ditampilkan hanya 5 character dari string tersebut.
        System.out.printf("%30c:\n",' ');
        System.out.printf("%-30s: ","Nama");
    }
}