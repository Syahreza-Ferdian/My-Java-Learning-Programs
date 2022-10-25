import java.util.Scanner;

public class exerciseNum15_108 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int lottery, lotteryDigit1, lotteryDigit2, lotteryDigit3, guess, guessDigit1, guessDigit2, guessDigit3;
        lottery = (int)(Math.random()*900)+100;
    
        lotteryDigit1 = (lottery/100) % 10;
        lotteryDigit2 = (lottery/10) % 10;
        lotteryDigit3 = lottery % 10;

        System.out.print("Enter your lottery pick (3 digits): ");
        guess = scanner.nextInt();

        guessDigit1 = (guess/100) % 10;
        guessDigit2 = (guess/10) % 10;
        guessDigit3 = guess % 10;

        System.out.printf("The lottery number is %d\n", lottery);

        if(guess == lottery){
            System.out.println("Exact match: You win $10,000");
        }
        else if ((guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)
                ||(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                ||(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                ||(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
                ||(guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)){
            System.out.println("Match all digits: you win $3,000");
        }
        else if(guessDigit1 == lotteryDigit1
            || guessDigit1 == lotteryDigit2
            || guessDigit1 == lotteryDigit3
            || guessDigit2 == lotteryDigit1
            || guessDigit2 == lotteryDigit2
            || guessDigit2 == lotteryDigit3
            || guessDigit3 == lotteryDigit1
            || guessDigit3 == lotteryDigit2
            || guessDigit3 == lotteryDigit3){
                System.out.println("Match one digit: you win $1,000");
            }
        else System.out.println("Sorry, no match!");
    }
}