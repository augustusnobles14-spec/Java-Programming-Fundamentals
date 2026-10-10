import java.util.Scanner;

public class LabProgramI {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double ageY, weightP, heartBPM, timeM, Calories;

      ageY = scnr.nextDouble();
      weightP = scnr.nextDouble();
      heartBPM = scnr.nextDouble();
      timeM = scnr.nextDouble();

      Calories = (((ageY * 0.2757) + (weightP * 0.03295) + (heartBPM * 1.0781) - 75.4991) * timeM) / 8.368;

      System.out.printf("Calories: %.2f calories\n", Calories);

      scnr.close();

      
   }
} 