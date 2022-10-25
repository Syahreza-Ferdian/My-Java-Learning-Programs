//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class weirdNotWeird {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukkan sebuah bilangan bulat: ");

        int N = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        input.close();
        
        if (N%2 != 0) {
            System.out.println("Weird"); 
        }
        if (N%2 == 0) {
            if (N>=2 && N<=5) {
                System.out.println("Not Weird");
            }
            if (N>=6 && N<=20) {
                System.out.println("Weird");
            }
            if (N>20){
                System.out.println("Not Weird");
            }
        }
    }
}
