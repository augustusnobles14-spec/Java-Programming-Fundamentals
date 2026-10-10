import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String input;
        char lett0, lett1;

        input = scnr.nextLine();

        lett0 = input.charAt(0);
        lett1 = input.charAt(1);

        if (!(Character.isLetter(lett0) && Character.isLetter(lett1))){
            System.out.println("Error: both are not letter");
        }
        else {
            lett0 = Character.toUpperCase(lett0);
            lett1 = Character.toUpperCase(lett1);
            System.out.println("" + lett0 + lett1);

        }


        /* int lastIndex;
        char lastChar;
        
        System.out.print("Enter caption: ");

        input = scnr.nextLine();
        lastIndex = input.length() - 1;
        lastChar = input.charAt(lastIndex);


        

        if ((lastChar != '.') && (lastChar != '!') && (lastChar != '?')){
            input = input + "."; // input = input.concat(".");
        }
        System.out.println(input);*/
        scnr.close();
      
        
    }
}