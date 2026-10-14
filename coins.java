import java.util.Scanner; 

public class coins {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int  dollar, quarters, dimes, nickels, pennies, usrIntPennies;

      usrIntPennies = scnr.nextInt();
      
      if (usrIntPennies == 0) {
         System.out.println("No change");
      }
      else {

         dollar = usrIntPennies / 100;
         usrIntPennies = usrIntPennies % 100;

         quarters = usrIntPennies / 25;
         usrIntPennies = usrIntPennies % 25;

         dimes = usrIntPennies / 10;
         usrIntPennies = usrIntPennies % 10;

         nickels = usrIntPennies / 5;
         usrIntPennies = usrIntPennies % 5;

         pennies = usrIntPennies;

         if (dollar > 0) {
            if (dollar == 1){
               System.out.println(dollar + " Dollar");
            }
            else {
               System.out.println(dollar + " Dollars");
            }
         }
         if (quarters > 0) {
            if (quarters == 1){
               System.out.println(quarters + " Quarter");
            }
            else {
               System.out.println(quarters + " Quarters");
            }
         }
         if (dimes > 0) {
            if (dimes == 1) {
               System.out.println(dimes + " Dime");
            }
            else {
               System.out.println(dimes + " Dimes");
            }
         }
         if (nickels > 0) {
            if (nickels == 1) {
               System.out.println(nickels + " Nickel");
            }
            else {
               System.out.println(nickels + " Nickels");
            }
         }
         if (pennies > 0) {
            if (pennies == 1) {
               System.out.println(pennies + " Penny");
            }
            else {
               System.out.println(pennies + " Pennies");
            }
         }


      }
   

      scnr.close();
    
   }
}