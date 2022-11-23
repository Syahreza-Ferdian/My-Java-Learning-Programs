// import java.util.Scanner;

// public class exerciseNum5_276 {
//     private static final Scanner scanner = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.print("Enter ten number: ");
//         int input, count = 0;
//         int[] angka = new int[10];
//         for(int i = 0; i < angka.length; i++){
//             input = scanner.nextInt();
//             if(i == 0) angka[i] = input;
//             for(int j = 0; j < i + 1; j++){
//                 if(input == angka[j]) break;
//                 else if(input != angka[j] && j == i){
//                     count++;
//                     angka[count] = input;
//                 }
//             }
//         }
//         count++;
//         System.out.printf("The number of distinct number is: %d\n", count);
//         System.out.print("The distict numbers are: ");
//         for(int i = 0; i < count; i++){
//             System.out.printf("%d ", angka[i]);
//         }
//     }
// }
