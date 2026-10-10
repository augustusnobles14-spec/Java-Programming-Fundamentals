import java.util.Scanner; 

public class hightWays {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;

      highwayNumber = scnr.nextInt();
      
      if (highwayNumber >= 1 && highwayNumber <= 99) {
         if (highwayNumber % 2 == 0) {
            System.out.println("I-" + highwayNumber + " is primary, going east/west.");
         }
         else {
            System.out.println("I-" + highwayNumber + " is primary, going north/south.");
         }
        }

      else if (highwayNumber > 99 && highwayNumber <= 999) {
         primaryNumber = highwayNumber % 100;
         if (primaryNumber == 0) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
         }
         
         else {
            String direction = (primaryNumber % 2 == 0) ? "east/west." : "north/south.";
            System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going " + direction);
         }
      }

      
      else {
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }

      scnr.close();
   }
}