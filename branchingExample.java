import java.util.Scanner;

public class branchingExample {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int insurancePrice, userAge;

    
        userAge = scnr.nextInt();

        if (userAge < 25) {
            insurancePrice = 4800;

        }
        else {
            insurancePrice = 2200;
        }

        System.out.println("Annual price: $" + insurancePrice);

        scnr.close();

    }
}