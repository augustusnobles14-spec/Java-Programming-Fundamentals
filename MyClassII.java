import java.util.Scanner;

public class MyClassII {
    public static void main(String[] args){
        
     Scanner scnr = new Scanner(System.in);

     int usrN;

     System.out.print("Enter a number: ");

     usrN = scnr.nextInt();

     if (usrN % 2 != 0){
        System.out.println(usrN + " Is odd");
     }
     else {
        System.out.println(usrN + " Is even");
     }

      scnr.close();
        
    }
}
