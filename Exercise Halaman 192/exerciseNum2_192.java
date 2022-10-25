import java.util.Scanner;

public class exerciseNum2_192 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        final int MAX_QUESTIONS = 10;
        int count = 0, correctCount = 0;
        String output = "";
        long startTime = System.currentTimeMillis();

        while (count < MAX_QUESTIONS){
            int angka1 = (int)(Math.random()*15 + 1);
            int angka2 = (int)(Math.random()*15 + 1);

            if(angka1 < angka2){
                int temp = angka1;
                angka1 = angka2;
                angka2 = temp;
            }

            System.out.printf("What is %d - %d? ", angka1, angka2);
            int answer = in.nextInt();

            if((angka1 - angka2) == answer){
                System.out.printf("You are correct!\n\n");
                correctCount++;
            }
            else{
                System.out.printf("Your answer is wrong.\n");
                System.out.printf("%d - %d should be %d\n\n", angka1, angka2, (angka1 - angka2));
            }
            count++;

            output += String.format("%2d - %2d = %2d %s\n", angka1, angka2, answer, (angka1 - angka2 == answer)?"Correct":"Wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.printf("Correct count is %d", correctCount);
        System.out.printf("\nTest time is %d seconds\n", testTime/1000);
        System.out.printf("\n");
        System.out.printf(output);
    }
}
