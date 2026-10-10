import java.util.Scanner;

public class tollCalc {
    public static void main(String[] args){
        
    Scanner scnr = new Scanner(System.in);

    String userInput;
    int colonIndex, timeHour, timeMinute;
    double tollAmount;

    System.out.print("Enter time of travel in HH:MM 24 hour format: ");
    userInput = scnr.nextLine();

    colonIndex = userInput.indexOf(":");
    timeHour = Integer.parseInt(userInput.substring(0, colonIndex));
    timeMinute = Integer.parseInt(userInput.substring(colonIndex + 1));

    if (timeHour < 6) {
        tollAmount = 1.55;
    }
    else if (timeHour < 10) {
        tollAmount = 4.65;
    }
    else if (timeHour < 18) {
        tollAmount = 2.35;
    }
    else {
        tollAmount = 1.55;
    }
    System.out.printf("Toll at %d:%02d is %.2f\n", timeHour, timeMinute, tollAmount);



    scnr.close();
        
    }
}