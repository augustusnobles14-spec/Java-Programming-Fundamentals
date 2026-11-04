import java.util.Scanner; 

public class decimalToBinary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int userInput;
      boolean modResult;
      
      userInput = scnr.nextInt();
      modResult = userInput % 2 == 0;

      while (userInput >= 1) {
         if(!modResult) {
            System.out.print(userInput % 2);
            userInput = userInput / 2;

         }
         else {
            System.out.print(userInput % 2);
            userInput = userInput / 2;
         }
      }
      System.out.println();
      scnr.close();
   }
}