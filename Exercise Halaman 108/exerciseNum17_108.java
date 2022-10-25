import java.util.Scanner;

public class exerciseNum17_108 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //scissor > paper
        //rock > scissor
        //paper > rock

        while(true){
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = in.nextInt();
            int computer = (int)(Math.random()*3);
            
            if(computer == 0){
                if(user == 0) System.out.println("The computer is scissor. You are scissor too. It is draw.");
                else if(user == 1) System.out.println("The computer is scissor. You are rock. You won.");
                else if(user == 2) System.out.println("The computer is scissor. You are paper. You lose.");
            }else if(computer == 1){
                if(user == 0) System.out.println("The computer is rock. You are scissor. You lose.");
                else if(user == 1) System.out.println("The computer is rock. You are rock too. It is draw.");
                else if(user == 2) System.out.println("The computer is rock. You are paper. You won.");
            }
            else if(computer == 2){
                if(user == 0) System.out.println("The computer is paper. You are scissor. You won.");
                else if(user == 1) System.out.println("The computer is paper. You are rock. You lose.");
                else if(user == 2) System.out.println("The computer is paper. You are paper too. It is draw.");
            }

            System.out.print("Wanna play again? (y/n): ");
            String userChoice = in.next();
            if(userChoice.equals("n")){
                break;
            }
        }
    }
}