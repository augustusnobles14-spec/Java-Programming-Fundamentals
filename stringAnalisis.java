import java.util.Scanner;

public class stringAnalisis {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String usrInput;
        int i, numLetters;
        char individualChar;



        System.out.print("Enter a string: ");
        usrInput = scnr.nextLine();

    
        numLetters = 0;
        System.out.print("All char together: ");
        for (i = 0; i < usrInput.length(); ++i) {
            individualChar = usrInput.charAt(i);
            
            if (Character.isLetter(individualChar)) {
                System.out.print(individualChar);
                ++numLetters;
            }
        }
        System.out.print("\nTotal characters: " + numLetters);


        scnr.close();
      
        
    }
}