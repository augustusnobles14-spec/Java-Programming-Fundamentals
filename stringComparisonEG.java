import java.util.Scanner;

public class stringComparisonEG {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String input = scnr.next();



        if (input.compareToIgnoreCase("usa") == 0){
            System.out.println("United States Of America");

        }
        else {
            System.out.println(input);
        }

        /*if (input.equalsIgnoreCase("usa")){
            System.out.println("United States Of America");

        }
        else {
            System.out.println(input);
        }
*/
        scnr.close();
      
        
    }
}