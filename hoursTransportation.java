import java.util.Scanner;

public class hoursTransportation {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        double distMiles, hrsFLy, hrsDrive;

        System.out.print("Enter number of miles: ");
        distMiles = scnr.nextDouble();

        hrsFLy = distMiles / 500.0;
        hrsDrive = distMiles / 60.0;

        /* System.out.println("Hours to fly " + hrsFLy );
        System.out.println("Hours to drive " + hrsDrive );
        */
        
        System.out.printf("Hours to fly: %.2f\n", hrsFLy);
        System.out.printf("Hours to drive: %.2f\n", hrsDrive);

        scnr.close();
    }
}