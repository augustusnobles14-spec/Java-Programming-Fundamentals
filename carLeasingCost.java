import java.util.Scanner;

public class carLeasingCost {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int downPayment, monthlyPayment, numMonths, totalCost;

        System.out.print("Enter down payment: ");
        downPayment = scnr.nextInt();

        System.out.print("Enter monthly payment: ");
        monthlyPayment = scnr.nextInt();

        System.out.print("Enter number of month: ");
        numMonths = scnr.nextInt();

        totalCost = downPayment + (monthlyPayment * numMonths);

        System.out.println("Total cost is: " + totalCost);

        scnr.close();

    }
}