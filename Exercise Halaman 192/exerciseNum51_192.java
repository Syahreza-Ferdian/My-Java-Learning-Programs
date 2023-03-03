import java.util.Scanner;

public class exerciseNum51_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first string: ");
        String kalimat1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String kalimat2 = scanner.nextLine();
        int i = 0;
        boolean common = false;
        if(kalimat1.indexOf(" ") > -1 && kalimat2.indexOf(" ")>-1){
            if(kalimat1.substring(0, kalimat1.indexOf(" ")).equals(kalimat2.substring(0, kalimat2.indexOf(" ")))){
                System.out.print("The common prefix is \" ");
                while(kalimat1.substring(i, i+1).equals(kalimat2.substring(i, i+1))){
                    System.out.printf("%s", kalimat1.substring(i, i+1));
                    i++;
                    common = true;
                }
                System.out.print("\"");
            }
        }
        else if(kalimat1.indexOf(" ") == -1 && kalimat2.indexOf(" ") == -1){
            if(kalimat1.equals(kalimat2)){
                System.out.print("The common prefix is \" ");
                System.out.printf("%s", kalimat1);
                common = true;
                System.out.print("\"");
            }
            else System.out.printf("%s and %s have no common prefix", kalimat1, kalimat2);
        }
    }
}
