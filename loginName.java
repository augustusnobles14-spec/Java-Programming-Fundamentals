import java.util.Scanner;

public class loginName {

	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String firstW, lastW;
      int num;

      firstW = scnr.next();
      lastW = scnr.next();
      num = scnr.nextInt();

      if (firstW.length() > 6) {
         System.out.println("Your login name: " + (firstW.substring(0, 6)) + lastW.charAt(0) + "_" + (num % 10));
      }
      else {
         System.out.println("Your login name: " + firstW + lastW.charAt(0) + "_" + (num % 10));
      }

		
      scnr.close();
	}
}