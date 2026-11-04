import java.util.Scanner;

public class arrayExampleI {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int[] userVals = new int[6];
        int i;
    
        
        
        
        for (i=0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            
        }
        for (i=0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        
            
        }
        System.out.println();

        for (i = 0; i < userVals.length / 2; ++i) {
            System.out.print(userVals[i] + " ");
        }
        
        System.out.println();

        for (i = userVals.length / 2; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();
        scnr.close();
    }
}