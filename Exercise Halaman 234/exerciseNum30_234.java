// public class exerciseNum30_234 {
//     public static void main(String[] args) {
//         int dice1 = (int)(Math.random()*6 + 1);
//         int dice2 = (int)(Math.random()*6 + 1);
//         System.out.printf("You %d + %d = %d\n", dice1, dice2, jumlahDuaDadu(dice1, dice2));
//         if(jumlahDuaDadu(dice1, dice2) == 2 || jumlahDuaDadu(dice1, dice2) == 3 || jumlahDuaDadu(dice1, dice2) == 12) System.out.println("You lose");
//         else if(jumlahDuaDadu(dice1, dice2) == 7 || jumlahDuaDadu(dice1, dice2) == 11) System.out.println("You win");
//         else{
//             int sumPoint = jumlahDuaDadu(dice1, dice2);
//             main(args);
//             while (jumlahDuaDadu(dice1, dice2) != 7 || jumlahDuaDadu(dice1, dice2) == sumPoint) {
//                 if(jumlahDuaDadu(dice1, dice2) == 7){
//                     System.out.println("You Lose");
//                     break;
//                 } 
//                 else {
//                     System.out.println("You win");
//                     break;
//                 }
//             }
//         }
//     }
//     public static int jumlahDuaDadu(int dice1, int dice2){
//         return dice1 + dice2;
//     }
// }