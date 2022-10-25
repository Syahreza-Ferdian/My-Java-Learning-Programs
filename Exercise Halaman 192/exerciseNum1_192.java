import java.util.Scanner;

public class exerciseNum1_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        int angka, countPositif = 0, countNegatif = 0;
        double jumlah = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        String inputPertama = scanner.next();
        int angkaPertama = Integer.parseInt(inputPertama);

        if(angkaPertama == 0){
            System.out.println("No numbers are entered except 0");
        }
        else{
            if(angkaPertama > 0) countPositif = 1;
            if(angkaPertama < 0) countNegatif = 1;
            do {
                input = scanner.next();
                angka = Integer.parseInt(input);

                if(angka < 0){
                    countNegatif++;
                }
                else if(angka > 0){
                    countPositif++;
                }

                jumlah += angka;
            } while (angka != 0);

            System.out.printf("The number of positives is %d", countPositif);
            System.out.printf("\nThe number of negatives is %d", countNegatif);
            System.out.printf("\nThe total is %s", Double.toString(jumlah+angkaPertama));
            System.out.printf("\nThe average is %s", Double.toString((jumlah+angkaPertama)/(countNegatif+countPositif)));
        }
    }
}
