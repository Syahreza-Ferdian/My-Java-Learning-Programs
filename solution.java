import java.io.*;
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int m = input.nextInt();
        int Minimal = 0;
        int Maksimal = 0;
        int Clonen = n;
        int[] siji = new int[m];
        int[] loro = new int[m];

        for(int i=0; i<m ; i++){
            siji[i] = input.nextInt();
            loro[i] = siji[i];
        }

        while(n>0){
            Arrays.sort(siji);
            Maksimal += siji [siji.length-1];
            siji [siji.length-1]--;
            n--;    
        }

        n=Clonen;

        while(n>0){
            Arrays.sort(loro);
            for(int i=0; i<loro.length; i++){
                if(loro[i]>0){
                    Minimal += loro[i];
                    loro[i]--;
                    break;
                }
            }
            n--;
        }
        System.out.println(Maksimal+" "+Minimal);

    }
}