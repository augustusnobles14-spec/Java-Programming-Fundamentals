import java.util.Scanner;

public class loopExampleI {
    public static void main(String[] args){
        
     Scanner scnr = new Scanner(System.in);
     int sum, val, laps;
     double avg;
    
     sum = 0;
     laps = 0;
     avg = 0.0;
     val = scnr.nextInt();

     while (val > -1) {
        sum = sum + val;
        laps += 1;
        val = scnr.nextInt();

     }

     avg = (double) sum / laps;

     System.out.println(avg);
     System.out.println(sum); 

     scnr.close();
        
    }
}