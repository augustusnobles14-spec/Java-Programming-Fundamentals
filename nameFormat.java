import java.util.Scanner; 

public class nameFormat {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String completeName, firstN, secondW, lastW;


      completeName = scnr.nextLine();

      int firstSpace = completeName.indexOf(" ");
      int lastSpace = completeName.lastIndexOf(" ");

      if (firstSpace == lastSpace) {
         firstN = completeName.substring(0, firstSpace);
         lastW = completeName.substring(firstSpace + 1);

         System.out.println(lastW + ", " + firstN.charAt(0) + ".");
      }
      else {
         firstN = completeName.substring(0, firstSpace);
         secondW = completeName.substring(firstSpace + 1, lastSpace);
         lastW = completeName.substring(lastSpace + 1);

         System.out.println(lastW + ", " + firstN.charAt(0) + "." + secondW.charAt(0) + ".");
      }

      scnr.close();
      
      
   }
}