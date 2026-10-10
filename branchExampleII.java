import java.util.Scanner;
// This program should be fixed have logical error
public class branchExampleII {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int numYears;
        String output;

        numYears = scnr.nextInt();


        if (numYears < 1){
            output = null;
            System.out.println("Error rango incorrecto");;
        }

        else if (numYears >= 1 && numYears <= 25){
            output = "Newlyweds";
        }

        else if (numYears <= 50){
            output = "Silver";
        }

        else if (numYears <= 75){
            output = "Golden";
        }

        else if (numYears <= 120){
            output = "Diamond";
        }

        else {
            output = null;
            System.out.println("Error rango incorrecto");
        }
        System.out.print(output);
        scnr.close();

    }
}