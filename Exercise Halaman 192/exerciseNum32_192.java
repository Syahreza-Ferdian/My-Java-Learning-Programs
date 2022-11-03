import java.util.Scanner;

public class exerciseNum32_192 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = scanner.nextInt();

        if((String.valueOf(guess).length() != 2)){
            System.out.print("The lottery pick must be two digits! Try again below!\n");
            System.out.println();
            main(args);
        }
        else{
            int guessDigit1 = guess / 10;
            int guessDigit2 = guess % 10;

            int lotteryDigit1 = (int)(Math.random()*9 + 1);
            int lotteryDigit2;
            
            do {
                lotteryDigit2 = (int)(Math.random()*10);
            } while (lotteryDigit2 == lotteryDigit1);

            int lottery = Integer.parseInt(String.valueOf(String.valueOf(lotteryDigit1)+String.valueOf(lotteryDigit2)));
            System.out.printf("The lottery number is %d\n", lottery);

            if(guess == lottery){
                System.out.println("Exact match: You win $10,000");
            }
            else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2){
                System.out.println("Match all digits: You win $3,000");
            }
            else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2){
                System.out.println("Match one digit: You win $1,000");
            }
            else System.out.println("Sorry, no match");
        }
    }
}
