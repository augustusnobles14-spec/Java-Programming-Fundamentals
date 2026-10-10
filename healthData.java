import java.util.Scanner;

public class healthData {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userAgeYears, userAgeDays, userAgeMinutes, totalHeartBeats;
        
        System.out.print("Enter your age in years: ");
        userAgeYears = scnr.nextInt();
        
        userAgeDays = userAgeYears * 365;
        userAgeMinutes = userAgeDays * 24 * 60;
        totalHeartBeats = userAgeMinutes * 72;

        System.out.println("You are " + userAgeDays + " days old.");
        System.out.println("You are " + userAgeMinutes + " minutes old.");
        System.out.println("Your heart has beaten arround " + totalHeartBeats + " times.");


        scnr.close();
    }
}